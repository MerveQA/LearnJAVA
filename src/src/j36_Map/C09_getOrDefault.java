package src.j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        // map.getOrDefault(); -> girilenkey map`te varsa key`e ait value yoksa default deger return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm: " + hm);
        //{Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.getOrDefault(\"Ebay\",\"Ebik\") = " + hm.getOrDefault("Ebay", "Ebik")); // 234 Euro
        //Ebay key map`te var oldugu icin Ebay key`e ait value: 234 Euro return oldu.
        System.out.println("hm.getOrDefault(\"Gabik\",\"Ebik\") = " + hm.getOrDefault("Gabik", "Ebik")); // Ebik
        // Gabik key map`te olmadigi icin key`e default deger Ebik atanip return edildi

        System.out.println("hm: " + hm);
        //{Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}
