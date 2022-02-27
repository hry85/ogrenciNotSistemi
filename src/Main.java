public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","555","TRH");
        Teacher t2 = new Teacher("Graham Bell","111","FZK");
        Teacher t3 = new Teacher("Kulyutmaz", "222", "BIO");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Verbal tarihSozlu = new Verbal("Tarih sozlu", "101", "TRHS");
        tarihSozlu.addTeacher(t1);

        Verbal fizikSozlu = new Verbal("Fizik sozlu", "102", "FZKS");
        fizikSozlu.addTeacher(t2);

        Verbal biyoSozlu = new Verbal("Biyoloji sozlu", "103", "BIOS");
        biyoSozlu.addTeacher(t3);


        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, biyo, tarihSozlu, fizikSozlu, biyoSozlu);
        s1.addBulkExamNote(100,20,50,80,40,60);
        s1.isPass();


        Student s2 = new Student("Guduk Necmi", "111", "4", tarih, fizik, biyo, tarihSozlu, fizikSozlu, biyoSozlu);
        s2.addBulkExamNote(70,55,80,60,50,80);
        s2.isPass();

        Student s3 = new Student("Domdom Hayri", "342", "4", tarih, fizik, biyo, tarihSozlu, fizikSozlu, biyoSozlu);
        s3.addBulkExamNote(50,45,90,55,50,70);
        s3.isPass();


    }
}
