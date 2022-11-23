package src.j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // String data array`a cevirme... split() -> girilen parametre degere gore String ifade parcalanir.

        String str="JavaCAN`lara selam olsun. En kisa zamanda bolcana offer sonrasi TUZLABALIK :)";

       // TASK: String ifadedeki kelime sayisini print eden code create edin
        String strArr[]= str.split(" "); // str her " " karaktere gore parcalanir.
                                               // her bir parca strArrayin bir elemani olarak atandi
        System.out.println(Arrays.toString(strArr));
        // [JavaCAN`lara, selam, olsun., En, kisa, zamanda, bolcana, offer, sonrasi, TUZLABALIK, :)]

        System.out.println(strArr.length); // 11

        //TASK: String ifadedeki harf sayisini print eden code create ediniz.

        System.out.println(str); // JavaCAN`lara selam olsun. En kisa zamanda bolcana offer sonrasi TUZLABALIK :)

        str=str.replaceAll(" ",""); // Stringteki tum bosluklar silindi
        str=str.replaceAll("\\W",""); // Stringteki harfler disindaki tum noktalama isaretleri silindi

        System.out.println(str); //JavaCANlaraselamolsunEnkisazamandabolcanaoffersonrasiTUZLABALIK

        String harfArr[]= str.split(""); //string harf harf ""hiçlik e göre parçalandı
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length); // 63


    }
}
