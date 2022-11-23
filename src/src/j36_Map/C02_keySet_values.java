package src.j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();

        // map.keySet(); -> map key degerini set`e atayip return eder
        // map.values(); -> map value degerlerini coll. atayip return eder
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm: "+hm);

        System.out.println("hm.keySet() = " + hm.keySet()); //[Apple Store, Saturn, Ebay, MediaMarkt, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values()); //[333 Euro, 300 Euro, 234 Euro, 183 Euro, 296 Euro, 111 Euro]

        System.out.println(" *** ");
        //TASK: hm key ve value degerlerini satir satir print ediniz. with loop

        for (String w:hm.keySet() ) { //key
            System.out.print(w+" "); // Apple Store Saturn Ebay MediaMarkt Amazon Vatan
        }
        System.out.println();
        for (String ch: hm.values()) { //value
            System.out.print(ch+" "); // 333 Euro 300 Euro 234 Euro 183 Euro 296 Euro 111 Euro
        }
    }
}
