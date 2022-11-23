package src.j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();

        // map.get(key); -> girilen key degerini value`sini return eder.
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm: "+hm);

        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay")); //234 Euro
        System.out.println("hm.get(\"Haluk\") = " + hm.get("Haluk")); //null -> olmayan key icin null return eder.
        System.out.println("hm.get(12) = " + hm.get(12)); //null -> key data type farketmeksizin olmayan key null return eder


    }
}
