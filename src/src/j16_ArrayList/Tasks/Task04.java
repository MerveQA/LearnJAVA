package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1= new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> list2= new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            if (!list1.get(i).toLowerCase().contains("a") ){
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);

        list1.clear(); // list1 bosaltildi
        list1.addAll(list2); // [Veli, Omer] list1`e atandi
        System.out.println(list1);




    }
}
