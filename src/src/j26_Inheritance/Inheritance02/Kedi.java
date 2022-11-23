package src.j26_Inheritance.Inheritance02;

public class Kedi extends Mammal { // Mammal parent class childi(torun)

    /*
    Child Class obj olmadan parent class variable ve methodlara ulasabilir.
     */

    public Kedi() { // parametresiz cons.
        super(); // bunu yazmasakta default olarak yine burada bulunan super(); p.siz cons call ile call edilecekti
        System.out.println("KEDI parametresiz Cons.");
    }

    public Kedi(String str) { // parametreli cons.
        this(); // buraya this(); yazdigimiz icin super(); ezildi
        System.out.println("KEDI parametresiz Cons.");

        System.out.println("super.c = "+super.c); // parentinde c variable varsa yazdiracak
    }

    int c=2;
    int d=5;

    @Override
    public void mC() { // Mammal parentten ezen method
        System.out.println("mC -> Kedi classtan method call edildi");
    }
}
