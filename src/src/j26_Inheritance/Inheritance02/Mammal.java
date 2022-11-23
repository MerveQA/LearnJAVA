package src.j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancik { // Hayvancik parentin Child classidir (babadir)

    public Mammal() { // parametresiz cons.
        this('Y');
        System.out.println("MAMMAL parametresiz Cons.");
    }

    public Mammal(char c) { // parametreli cons.
        super(17);
        System.out.println("MAMMAL parametreli Cons.");
    }

    public void mC(){
        System.out.println("mC -> Mammal class method call");
    }

    int m=1;
    int c=4;

    @Override
    public void mM() { // ezen methoddur

        System.out.println("mM -> Mammal class method call");
    }
}// Class Sonu
