package week5.pratik_maas_hesaplayici;

public class Employee {

    String name ;
    double maas;
    int workHours;
    int hireYear;

    Employee(String name , double maas, int workHours , int hireYear){
        this.name = name ;
        this.maas= maas;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double temp_salary = this.maas;
        if (temp_salary<=1000)
            temp_salary = temp_salary;
        else{
            temp_salary -= (temp_salary*3/100);
        }
        return this.maas - temp_salary;
    }

    public double bonus(){
        double temp_salary = this.maas;
        if (this.workHours>=40) {
            int mesai_saati = this.workHours - 40;
            temp_salary += mesai_saati * 30;
        }
        else{
            System.out.println("Mesai ücreti yok.");
        }
        return temp_salary - this.maas;
    }
    public double raiseSalary(){
        int bu_yıl = 2021;
        double temp_salary = this.maas;
        if ((bu_yıl-hireYear)<=10){
            temp_salary += (temp_salary*5/100);

        }
        else if ((bu_yıl-hireYear)>9 && (bu_yıl-hireYear)<20){
            temp_salary += (temp_salary*10/100);

        }
        else if ((bu_yıl-hireYear)>19){
            temp_salary += (temp_salary*15/100);

        }
        return temp_salary - this.maas;
    }
    @Override
    public String toString() {
        return "Ad: " + this.name +
                ", Maaş: " + this.maas +
                ", Çalışma saati: " + this.workHours +
                ", Başlangıç yılı : " + this.hireYear +
                ", Vergi : " + tax() +
                ", Mesai ücreti : " + bonus() +
                ", Maaş Artışı (raiseSalary() : " + raiseSalary() +
                ", Vergi ve Bonuslar ile birlikte maaş : " + (this.maas - tax() + bonus()) +
                ", Toplam maaş : " + (this.maas - tax() + bonus() + raiseSalary());

    }
}
