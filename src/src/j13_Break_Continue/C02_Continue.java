package src.j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.

        */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("mail adresi girin: ");
        String mail=sc.nextLine();

        for (int i = 0; i < mail.length(); i++) { // 0 indexten mail son indexe kadar herbir karakteri donguye alir

            char ch= mail.charAt(i); // dongudeki herbir karakteri ch`ye atar

            if (ch==' ') { // ch`de bosluk varsa if blok run olur
                continue; // her boslukta yazdirmadan atlar
            }
            System.out.print(ch);

        }


    }
}
