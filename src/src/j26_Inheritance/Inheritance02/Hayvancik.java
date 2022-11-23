package src.j26_Inheritance.Inheritance02;

public class Hayvancik { // grandparent super class

    public Hayvancik() { // parametresiz costructor

        System.out.println("HAYVANCIK parametresiz Cons.");
    }

    public Hayvancik(int i) { // parametreli costructor

        System.out.println("HAYVANCIK parametreLI Cons.");
    }

    public void mA(){

        System.out.println("mA -> HAYVANCIK classtan method call");
    }
    protected void mM(){

        System.out.println("mM -> HAYVANCIK classtan method call");
    }

    int a;
    int m=3;


}
