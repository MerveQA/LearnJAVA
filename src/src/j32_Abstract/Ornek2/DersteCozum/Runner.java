package src.j32_Abstract.Ornek2.DersteCozum;

public class Runner {
    public static void main(String[] args) {

        DikdortgenClass dd =new DikdortgenClass(24,7);
        dd.setName("Dikdortgen");
        //dd.cevreHesapla();
        //dd.alanHesapla();
        //dd.ciz();
        System.out.println(dd);

        CemberClass c1=new CemberClass(39);
        c1.setName("Cember");
        System.out.println(c1);

    }
}
