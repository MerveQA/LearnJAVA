package src.j36_Map.Tasks;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {

        Hashtable<String,String> ht = new Hashtable<>();

        ht.put("kebap","adana");
        ht.put("köfte","tekirdag");
        ht.put("doner","sivas");
        ht.put("corba","beyran");
        ht.put("sögüş","");

        System.out.println(ht);
    }
}
