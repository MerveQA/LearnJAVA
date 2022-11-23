package src.j20_PassByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

        /*
        eger bir method`da yapılan değişiklik kalıcı olsun istenirse
        2. değişklik yapılan variable'lar atama tanımlanır.
        */

        double etiketFiyati=100;
        double indirimOrani=0.1;

        System.out.println("indirim oncesi etiketFiyati = " + etiketFiyati); // 100

        etiketFiyati=indirim(etiketFiyati,indirimOrani); // 90

        System.out.println("indirim sonrasi etiketFiyati = " + etiketFiyati); // 90


    }

    public static double indirim(double fiyat, double oran){

        fiyat*=(1-oran);
        System.out.println("Indirimli fiyat: "+fiyat);
        return fiyat;
    }
}
