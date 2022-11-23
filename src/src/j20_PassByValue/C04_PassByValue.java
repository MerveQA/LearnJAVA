package src.j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyati;
    static double indirimOrani;

    public static void main(String[] args) {

        /*
        Eger bir  methodda yapilan degisiklik kalici olsun istenirse
        1. degisiklik yapilan variable`lar static olarak tanimlanir.
         */

        etiketFiyati=100;
        System.out.println("indirim oncesi etiketFiyati = " + etiketFiyati); // 100

        indirimOrani=0.1;
        indir();// method call -> 90.0

        indirimOrani=0.1;
        indir(); // 81.0

        indirimOrani=0.1;
        indir(); // 72.9

        System.out.println("indirim sonrasi etiketFiyati = " + etiketFiyati); // 72.9
    }

    public static void indir(){

        etiketFiyati*=(1-indirimOrani);
        System.out.println("etiketFiyati = " + etiketFiyati);
    }
}
