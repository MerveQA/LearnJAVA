package src.j18_Constructor.Tasks.Student;

public class Lesson {

    String lessonName;
    int credit;

    public Lesson(String lessonName, int credit) {
        this.lessonName = lessonName;
        this.credit = credit;
    }

    public Lesson() {
    }

    @Override
    public String toString() {
        return " Lesson Name: " + lessonName + " Credit: "+lessonName;
    }
}
