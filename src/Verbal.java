public class Verbal {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int verbalNote;

    Verbal(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalNote = 0;

    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        }
    }
}

