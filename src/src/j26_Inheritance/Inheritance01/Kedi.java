package src.j26_Inheritance.Inheritance01;

public class Kedi extends Mammal{ // Mammal parent class childi(torun)

    /*
    Child Class obj olmadan parent class variable ve methodlara ulasabilir.
     */


    public Kedi() {
        System.out.println("KEDI parametresiz Cons.");
    }


    public void cirmala (){
        System.out.println("KEDI fena cirmalar miyavlar");
    }
}
