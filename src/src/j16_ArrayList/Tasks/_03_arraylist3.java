package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        List<String> listSehir= new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        System.out.println(getLength(listSehir)); // 10 8 4 7 6 0
    }

    private static Integer getLength(List<String> listSehir) {

        int uzunluk=0;

        for (String w : listSehir) {

            uzunluk=w.length();

            System.out.print(uzunluk+" ");
            uzunluk=0;

        }
        return uzunluk;
    }
}