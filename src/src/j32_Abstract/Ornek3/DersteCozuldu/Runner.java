package src.j32_Abstract.Ornek3.DersteCozuldu;

public class Runner {
    public static void main(String[] args) {
        BaklavaClass b =new BaklavaClass();
        b.madeIn(); // Yerli ve Milli 27 ayar antep baklava -> Baklava Classtan
        b.taste(); // good, sugar, sweet -> BaklavaClassta olmadigi icin SweetClasstan geldi
        System.out.println("b = " + b); // j32_Abstract.Ornek3.DersteCozuldu.BaklavaClass@64616ca2

        SezarSaladClass ss =new SezarSaladClass();
        ss.taste(); // Gavurdagi coban salata, sogusmu verelim -> SaladClasstan
        ss.madeIn(); // Sezar salata Italy -> Sezar Salad Classtan
        System.out.println("ss = " + ss); // j32_Abstract.Ornek3.DersteCozuldu.SezarSaladClass@783e6358


    }
}
