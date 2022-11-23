package src.j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancik{ // Hayvancik parentin Child classidir (babadir)


    public Mammal() { // parametresiz cons.
        System.out.println("MAMMAL parametresiz Cons.");
    }

    public void sutBeslenme(){

        System.out.println("Bebeleri SUT ile beslenir. ");
    }

    public void dogum (){

        System.out.println("DOGUM ");
    }
}
