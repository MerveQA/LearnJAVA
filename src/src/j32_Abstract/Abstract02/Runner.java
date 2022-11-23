package src.j32_Abstract.Abstract02;

public class Runner {
    public static void main(String[] args) {

        Isci isci1= new Isci();
        isci1.maasBilgisi(); // (Isci Class) Molalar haric 8 saat mesai vardir.
        isci1.maasHesapla(); // (Isci Class) En cok yevmiye 499 gayme
        isci1.name="Ebubekir Bey";
        System.out.println("name = " + isci1.name); // name = Ebubekir Bey
        isci1.sigorta(); // Abstract Parent classtaki Concrete method obje ile call edildi
                         //(Personel Class) Ozel Sigorta Kapsamindasiniz.

        IdariPersonel idari =new IdariPersonel();
        idari.name="Dilek Hanim";
        System.out.println("idari.name = " + idari.name); // idari.name = Dilek Hanim
        idari.sigorta(); // (IdariPersonel) Idari personele full sigorta
        idari.maasHesapla(); // (IdariPersonel) idari personel saatlik ucreti 120$
        idari.maasBilgisi(); // (IdariPersonel) Iyi calisan idari personele ekstra 1000 gayme

    }
}
