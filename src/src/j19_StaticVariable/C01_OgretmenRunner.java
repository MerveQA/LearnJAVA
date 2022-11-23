package src.j19_StaticVariable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul = "KABATAS ERKEK LISESI";// gunes degeri update oldu

        C01_Ogretmen hc1 = new C01_Ogretmen("Cuneyt", 11);
        System.out.println("hc1.tecrube = " + hc1.tecrube); // 11
        System.out.println("hc1.isim = " + hc1.isim); // Cuneyt
        //hc1.okul="kabatas"; // static var. obj ile call edilmez.
        System.out.println("hc1.okul = " + C01_Ogretmen.okul); // KABATAS ERKEK LISESI


        C01_Ogretmen hc2 = new C01_Ogretmen("Bekir", 7);
        System.out.println("hc2.tecrube = " + hc2.tecrube); // 7
        System.out.println("hc2.isim = " + hc2.isim); // Bekir
        //hc2.okul="kabatas";
        System.out.println("hc2.okul = " + hc2.okul); // KABATAS ERKEK LISESI


        C01_Ogretmen hc3 = new C01_Ogretmen("Nazim", 13);
        System.out.println("hc3.tecrube = " + hc3.tecrube); // 13
        System.out.println("hc3.isim = " + hc3.isim); // Nazim
        //hc3.okul="kabatas";
        System.out.println("hc3.okul = " + hc3.okul); // KABATAS ERKEK LISESI


        hc1.evlilikYilDonumu();// obj ile non-static method call ettik.
        C01_Ogretmen.maasHesapla(); // Class ismiyle static method call ettik.
        hc2.maasHesapla(); // obje ile static method call edildi. bu-> bad-practice. Tavsiye edilmez
    }
}
