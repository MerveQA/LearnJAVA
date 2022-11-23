package src.j32_Abstract.Abstract02;

public class IdariPersonel extends Personel {

    @Override // mecbur implement edilmeli
    public void maasHesapla() { // Personel parent classtan override edilen Abstract method

        System.out.println("(IdariPersonel) idari personel saatlik ucreti 120$");
    }

    @Override // mecbur implement edilmeli
    public void maasBilgisi() { // Personel parent classtan override edilen Abstract method

        System.out.println("(IdariPersonel) Iyi calisan idari personele ekstra 1000 gayme");
    }

    @Override
    public void sigorta() { //  // Personel parent classtan override edilen Concrete method
        System.out.println("(IdariPersonel) Idari personele full sigorta");
    }
}
