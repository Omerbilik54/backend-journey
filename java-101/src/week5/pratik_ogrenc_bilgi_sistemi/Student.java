package week5.pratik_ogrenc_bilgi_sistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int quiz1 , int note2, int quiz2, int note3, int quiz3 ) {

        if (note1 >= 0 && note1 <= 100){
            this.c1.quiz = quiz1;
            this.c1.note = note1;}
        if (note2 >= 0 && note2 <= 100){
            this.c2.quiz = quiz2;
            this.c2.note = note2;}
        if (note3 >= 0 && note3 <= 100){
            this.c3.quiz = quiz3;
            this.c3.note = note3;}


    }

    void isPass(){
        this.avarage =(this.c1.note*0.60 + this.c1.quiz*0.40 + this.c2.note*0.60 + this.c2.quiz*0.40 + this.c3.note*0.60 + this.c3.quiz*0.40)/3;
        if(this.avarage >= 55) {
            System.out.println("Dersi geçtiniz.");
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }





    void printNote() {
        System.out.println(c1.name + " Notu :" + c1.note);
        System.out.println("Sözlü notu : " + c1.quiz);
        System.out.println(c2.name + " Notu :" + c2.note);
        System.out.println("Sözlü notu : " + c2.quiz);
        System.out.println(c3.name + " Notu :" + c3.note);
        System.out.println("Sözlü notu : " + c3.quiz);
        System.out.println("Ortalamanız : " + this.avarage);
    }

}
