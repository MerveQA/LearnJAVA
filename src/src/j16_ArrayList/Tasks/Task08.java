package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

    // TASK: Girilen sayilarin icinde ortalamadan buyuk olanlari print eden method create ediniz.

        Scanner scan= new Scanner(System.in);

        List<String> strList=new ArrayList<>();

        do {
            System.out.print("Sayi giriniz.\nDurmak istediginizde \"Q\" girin:");
            strList.add(scan.next().toUpperCase());

        }while (!Objects.equals(strList.get(strList.size() - 1), "Q"));

        strList.remove("Q");

        List<Integer> intList = new ArrayList<>();

        int toplam=0;
        int count=0;

        for (int i = 0; i < strList.size(); i++) {
            intList.add(Integer.parseInt(strList.get(i)));
            toplam+=intList.get(i);
            count++;
        }

        int ortalama= toplam/count;
        System.out.println("Kullanicinin girdigi sayilar: "+intList);
        System.out.println("ortalama: "+ortalama);

        System.out.print("Ortalamadan buyuk sayilar:  ");
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i)>ortalama){
                System.out.print(intList.get(i) + " ");
            }
        }

    }
}
