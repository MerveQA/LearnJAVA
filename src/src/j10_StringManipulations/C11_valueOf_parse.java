package src.j10_StringManipulations;

public class C11_valueOf_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // TASK: String type verilen iki adet bagis miktarini toplayan code create ediniz.

        String bagis1= "1500";
        String bagis2= "2500";

        int bagisDegeri1= Integer.valueOf(bagis1); // bagis1 String icindeki sayi degerini int`e cevirdi ve atadi
        int bagisDegeri2= Integer.valueOf(bagis2); // bagis2 String icindeki sayi degerini int`e cevirdi ve atadi

        System.out.println("valueOf toplam bagis: "+(bagisDegeri1+bagisDegeri2)); // 4000

        int fetih= Integer.valueOf("1453");
        System.out.println(fetih); // int 1453 verir

        System.out.println("parseInt toplam bagis: "+(Integer.parseInt(bagis1) + Integer.parseInt(bagis2))); // 4000

        int tc =1234567;
        String strTc= String.valueOf(tc);
        System.out.println("strTc = " + strTc);

        System.out.println("strTc+tc = " + (strTc + tc)); // 12345671234567

        String fiyat= "$150";
        int yeniFiyat= Integer.valueOf(fiyat); // RTE
        System.out.println("yeniFiyat = " + yeniFiyat);


    }
}
