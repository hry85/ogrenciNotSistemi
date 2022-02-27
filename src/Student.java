public class Student {
    Course c1;
    Course c2;
    Course c3;
    Verbal v1;
    Verbal v2;
    Verbal v3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Verbal v1, Verbal v2, Verbal v3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;

        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1, int note2, int note3, int vNote1, int vNote2, int vNote3){
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if (vNote1 >= 0 && vNote1 <= 100) {
            this.v1.verbalNote = vNote1;
        }
        if (vNote2 >= 0 && vNote2 <= 100) {
            this.v2.verbalNote = vNote2;
        }
        if (vNote3 >= 0 && vNote3 <= 100) {
            this.v3.verbalNote = vNote3;
        }


    }

    void isPass(){
        System.out.println("-------------------------");
        System.out.println(name);
        this.avarage = (((this.c1.note*80) + (this.v1.verbalNote*20))/100 + ((this.c2.note*80) + (this.v2.verbalNote*20))/100 + ((this.c3.note*80) + (this.v3.verbalNote*20))/100)/3.0;
        if (this.avarage > 55){
            System.out.println("Sinifi gectiniz ! ");
            this.isPass = true;

        }else {
            System.out.println("Sinif tekrari yaptiniz ! ");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){

        System.out.println(this.c1.name + " Notu : " +this.c1.note + " Sozlu : " +this.v1.verbalNote);
        System.out.println(this.c2.name + " Notu : " +this.c2.note + " Sozlu : " +this.v2.verbalNote);
        System.out.println(this.c3.name + " Notu : " +this.c3.note + " Sozlu : " +this.v3.verbalNote);
        System.out.println("Oratalamaniz : " + this.avarage);
    }

}
