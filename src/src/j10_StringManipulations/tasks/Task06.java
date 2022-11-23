package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        // Girilen Stringin son karakterini silen kod create ediniz

        Scanner scan= new Scanner(System.in);
        System.out.print("String girin: ");
        String str= scan.next();

        System.out.println(str.substring(0,str.length()-1));
        System.out.println(str.replace(str.substring(str.length()-1),""));




    }
}
