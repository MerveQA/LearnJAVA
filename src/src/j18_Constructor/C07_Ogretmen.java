package src.j18_Constructor;

public class C07_Ogretmen { // Kaliphane

    // Fields
    String isim;
    int tecrube;
    int kidem=5;

    public C07_Ogretmen(String isim, int tecrube) { // 2 p.li constructor
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kidemHesapla (int kidem){ // void method
        System.out.println("Agam kidemin: "+(kidem*2)); // method parametre degeri kideme atanir
        System.out.println("Agam kidemin: "+(this.kidem*2)); // instans obj degeri kideme atanir.
    }
}
