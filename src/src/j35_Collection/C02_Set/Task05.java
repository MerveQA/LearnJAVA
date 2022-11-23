package src.j35_Collection.C02_Set;


import java.util.LinkedHashSet;
import java.util.List;

public class Task05 {
/*
    Task->
    return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */

    public static void main(String[] args) {

        LinkedHashSet <String> hs=new LinkedHashSet<>(List.of("Germany","France","USA","Canada","Mexico","Brazil"));
        String s1="Germany";
        String s2="USA";

        System.out.println("hs = " + hs);
        System.out.println("removing() = " + removing(hs, s1, s2));
    }

    private static  LinkedHashSet <String> removing(LinkedHashSet<String> hs, String s1, String s2) {

        if (hs.contains(s1) || hs.contains(s2)){
            hs.remove(s1);
            hs.remove(s2);
        }

        return hs;
    }
}
