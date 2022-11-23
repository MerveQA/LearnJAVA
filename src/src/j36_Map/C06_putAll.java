package src.j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        // map.putAll(); -> girilen map`i istenen map`e ekler

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm: " + hm);
        //{Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("starBucks", "flat White");
        hm1.put("gulluoglu", "Cennet Camuru");
        hm1.put("Nusret", "Dana Spagetti");

        System.out.println("hm1: " + hm1); //{starBucks=flat White, Nusret=Dana Spagetti, gulluoglu=Cennet Camuru}

        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        //{Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, starBucks=flat White, Nusret=Dana Spagetti, MediaMarkt=183 Euro, gulluoglu=Cennet Camuru, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm1 = " + hm1); //{starBucks=flat White, Nusret=Dana Spagetti, gulluoglu=Cennet Camuru}

        //Cincix Code...
        HashMap<String, String> hm2 = new HashMap<>(hm1); // hm2 map hem tanimlandi hemde entry olarak hm1 parametre olarak entry atandi.
        System.out.println("hm2 = " + hm2); // {gulluoglu=Cennet Camuru, starBucks=flat White, Nusret=Dana Spagetti}
    }
}
