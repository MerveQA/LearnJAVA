package src.j04_AritmeticOperators;

public class C02_IncerementDecrement {
    public static void main(String[] args) {

        System.out.println("**** Incerement -> Artirma ****");

        int a= 7;
        System.out.println(++a); // once a`yi 1 arttirir a= 8 olarak yazdirir.

        System.out.println(a++); // a`yi once konsola a= 8 olarak yazdirir sonra hafizada a= 9 olur

        System.out.println(a);   // hazifaya aldigi a`yi yazdirir a= 9

        System.out.println(a++ + ++a); // ilkinde a`yi once isleme alir a=9 olarak sonra hafizada a= 10 olur
                                       // ikincide hafizadaki a`yi 10 olarak alir 1 arttirir ve a= 11 olur
                                       // 9 + 11 = 20

        // TASK ->
        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);


    }
}
