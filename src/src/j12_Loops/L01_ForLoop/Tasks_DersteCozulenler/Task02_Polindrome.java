package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {

        /*
        Girilen ifadenin polindrome olmasini kontrol eden method create ediniz...
        Polindrome: her iki yonden de okundugunda esit olan ifadeler
        Ornek: ey edip adanada pide ye
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("String girin: ");
        String str =sc.nextLine();

        polindrome(str);

    }

    private static void polindrome(String str) {
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+= str.charAt(i);
        }
        System.out.println("Girilen stringin tersten yazilisi: "+tersStr);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Girilen string polindrome");
        }else {
            System.out.println("Girilen string polindrome degildir");
        }




    }
}
