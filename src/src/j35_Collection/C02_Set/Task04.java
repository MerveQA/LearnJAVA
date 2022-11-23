package src.j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.List;

public class Task04 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
    olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1="banana";
        String str2="peach";

        System.out.println(changeSet(hs, str1, str2));

    }

    private static HashSet<String> changeSet(HashSet<String> hs, String str1, String str2) {

        if (hs.contains(str1)) {

            hs.remove(str1);
            hs.add(str2);
        }
        return hs;
    }
}
