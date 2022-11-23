package src.j18_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {

        C07_Ogretmen hoca = new C07_Ogretmen("SevdeNur Ogretmen",11);
        System.out.println("hoca.isim = " + hoca.isim); //
        System.out.println("hoca.kidem = " + hoca.kidem); //
        hoca.kidemHesapla(13); //

    }
}
