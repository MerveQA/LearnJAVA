package src.j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.List;

public class Task06 {
   /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
   public static void main(String[] args) {

       HashSet<Integer> hs=new HashSet<>(List.of(4,2,3,1,7));

       totalCount(hs); // 5
   }

    private static void totalCount(HashSet<Integer> hs) {
        System.out.println("hs.size() = " + hs.size());
    }
}
