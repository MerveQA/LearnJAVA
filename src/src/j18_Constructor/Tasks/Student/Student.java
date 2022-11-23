package src.j18_Constructor.Tasks.Student;

import java.util.ArrayList;

public class Student {

    // fields:
    String name;
    int maxCredit;

    ArrayList<Lesson> dersListesi;

    public Student() {
    }

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
    }

    public int toplamKredi (){

        int toplamKredi =0;

        for (Lesson w: dersListesi) {

            toplamKredi+= w.credit;

        }
        return toplamKredi;
    }

}
