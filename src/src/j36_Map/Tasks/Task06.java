package src.j36_Map.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        map1() isminde bir method oluşturun.
        Parametresi   bir Integer -String map  ve bir int
        return tipi String
        Tamsayı değerlerini (int) döndürün.
        ÖRNEK:
        Map:
                        1 ,  "Lion"
                        2 ,  "Tiger"
                        3 ,  "Elephant"
                        4 ,  "Cat"
                        5  , "Dog"
        Integer 3
        Cevap Elephant olmalı.
         */

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Lion");
        map.put(2, "Tiger");
        map.put(3, "Elephant");
        map.put(4, "Cat");
        map.put(5, "Dog");

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi girin: ");
        int key = sc.nextInt();

        System.out.println("Girilen Key`in Value`si: " + map1(map, key));

    }

    private static String map1(Map<Integer, String> map, int key) {

        return map.get(key);
    }

}
