package src.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task: Node degerleri "Yakup", "JavaCAN", "JavaTAR", "Tekinay" olan bir LnkedList create ediniz.
              Girilen bir String degeri LinkedListte varligini kontrol edip varsa silip "Agam Eleman Halledildi"
              yoksa "Agam aradiginiz kisiye ulasilamadi" yazdiran code create ediniz.
         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("Yakup", "JavaCAN", "JavaTAR", "Tekinay"));

        Scanner sc= new Scanner(System.in);
        System.out.print("Agam kime bakmistin: ");
        String str= sc.next();

        System.out.println("ll1 = " + ll1);

        if (ll1.remove(str)){ // true -> istenen node var ve silindi
            System.out.println("Agam Eleman Halledildi");
            System.out.println("Aganin adami hallolduktan sonra: " + ll1);
        }else { // false -> istenen node yok ve silinemedi
            System.out.println("Agam aradiginiz kisiye ulasilamadi");
        }

    }
}
