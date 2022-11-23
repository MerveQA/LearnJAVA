package src.j26_Inheritance.Task01;

public class Runner {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj); // A Classtan Selamlar
        System.out.println("A.mesaj = " + A.mesaj); // Class ismiyle call edildi

        B b = new B();
        System.out.println("a.mesaj = " + a.mesaj); // static variable inheritance`da className olmadan dogrudan Call edilir.
        System.out.println("b.mesaj = " + b.mesaj); // static variable inheritance`da className olmadan dogrudan Call edilir.

    }
}
