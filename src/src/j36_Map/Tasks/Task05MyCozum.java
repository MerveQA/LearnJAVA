package src.j36_Map.Tasks;

import java.util.Scanner;
import java.util.TreeMap;

public class Task05MyCozum {

    public static void main(String[] args) {
        //Task-> TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.print("Cumle girin: ");
        String str = sc.nextLine();

        String[] arr = str.split("");

        TreeMap<String, Integer> harfSayisi = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!harfSayisi.containsKey(arr[i])) {
                harfSayisi.put(arr[i], 1);
            }else {
                harfSayisi.put(arr[i], harfSayisi.get(arr[i])+1);
            }
        }
        System.out.println(harfSayisi);


    }
}
