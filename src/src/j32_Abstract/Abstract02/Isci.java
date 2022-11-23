package src.j32_Abstract.Abstract02;

public class Isci extends Personel{ // Abstract personel parent classa exdent edildi. -> Concrete child class

    @Override // mecbur implement edilmeli
    public void maasHesapla() { // Personel parent classtan override edilen Abstract method

        System.out.println("(Isci Class) En cok yevmiye 499 gayme");
    }

    @Override // mecbur implement edilmeli
    public void maasBilgisi() { // Personel parent classtan override edilen Abstract method

        System.out.println("(Isci Class) Molalar haric 8 saat mesai vardir.");
    }
}
