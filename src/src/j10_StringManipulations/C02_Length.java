package src.j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length() methodu girilen Stringin uzunlugunu  icinde bulunan karakter sayisini return eder.
        Butun karakterleri(bosluk vs.) sayip adedini veririr
         */

        String str= "madem geldin dunyaya otur calis Javaya";

        int strKrtrSayisi= str.length(); // int data type verir
        System.out.println(strKrtrSayisi); // 38
        System.out.println(str.length()); // 38

        String str1= "";
        System.out.println(str1.length()); // 0

        String str2=" ";
        System.out.println(str2.length()); // 1

        String str3= null;
        //System.out.println(str3.length()); // NullPointerException RTE

        // System.out.println(str3.concat(str1));

        //TRICK: null atanan String method calismaz

        /*
        null case sensitive`dir. yani Null veya NULL yazilamaz.
        null bir deger degildir sadece hicligi gosteren bir pointer(isaretci).
         */

        String name; // deklare edilmis ama atanmamis String

        //name.concat(str1); // CTE verir. Atanmamis String method calismaz. altini cizer.


    }
}
