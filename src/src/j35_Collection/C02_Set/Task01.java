package src.j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        /*
        Deger atamasi yapilan Arrayi ArrayListe ceviren method create ediniz.
        Main icerisinde methodun return ettigi arrayList`i hashSet, linkedHashSet ve treeSett`e atayiniz.
         */

        String arr[] = {"Muharrem", "Umit", "Sinan", "Nihan"};

        //arrayiListeCevir(arr);
        cevir(arr); // 2. YOL

        HashSet<String > hs = new HashSet<>(arrayiListeCevir(arr));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayiListeCevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrayiListeCevir(arr));

        System.out.println("hs =  " + hs); //[Muharrem, Sinan, Nihan, Umit] -> hurra karisik alir
        System.out.println("lhs = " + lhs);//[Muharrem, Umit, Sinan, Nihan] -> once gelen once girer
        System.out.println("ts =  " + ts); //[Muharrem, Nihan, Sinan, Umit] -> alfabetik siraya gore

    }

    private static ArrayList<String> arrayiListeCevir(String[] arr) {

        ArrayList<String> list = new ArrayList<>(List.of(arr));

        return list;
    }

    public static ArrayList cevir (String arr[]){

        List<String> list=Arrays.asList(arr);

      return (ArrayList) list;
    }
}
