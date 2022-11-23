package src.j36_Map;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        // map.entrySet(); -> girilen mapin key ve value datalarini Set`e atayip return eder
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm: " + hm);
        //{Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.entrySet() = " + hm.entrySet());
        //[Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro]

        for (Map.Entry<String,String> e:hm.entrySet()) { // entrySet ile gelen key value loop icin Entry<key,value> data type tanımlanır
            System.out.println("e.getValue() = " + e.getValue());
        }

    }
}
