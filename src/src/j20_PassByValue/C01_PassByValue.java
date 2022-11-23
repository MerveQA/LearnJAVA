package src.j20_PassByValue;

public class C01_PassByValue {
    /*
    Java Pass By Value bir proglama dilidir.
    Bir primitive variable argument olarak bir methoda call edildiginde variable degil
    bir copy clone (vesikalik) (pointer) degeri gonderilir.
     */

    public static void main(String[] args) {

        //TASK: verilen fiyat icin %24 artirilmis fiyati print eden method create ediniz.

        double fiyat=100;
        System.out.println("method call oncesi fiyat = " + fiyat);

        fiyatArtir(fiyat); // fiyat variable method call edildi
        System.out.println("method call sonrasi fiyat = " + fiyat);

    }

    public static void fiyatArtir(double a){

        a*=1.24;
        System.out.println("artirilmis fiyat: "+a);

    }

}
