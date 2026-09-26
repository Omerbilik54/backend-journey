package week5.pratik_ogrenc_bilgi_sistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ömer Hoca", "TRH","555");
        Teacher t2 = new Teacher("Hasan","KMY","2342");
        Teacher t3 = new Teacher("Yusuf","BIO","2452");
        Course tarih = new Course("Tarih","534","TRH");
        tarih.addTeacher(t1);
        Course kimya = new Course("Fizik","3534","KMY");
        kimya.addTeacher(t2);
        Course biyo = new Course("Biyo","342","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Şeyh Şamil","324","3",tarih,kimya,biyo);
        s1.addBulkExamNote(40,60,90,60,70,30);
        s1.isPass();
    }
}
