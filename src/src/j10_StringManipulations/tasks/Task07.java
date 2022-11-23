package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        /*
        Girilen String icindeki istenen indexdeki karakteri print eden kod create ediniz.
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("String girin: ");
        String str= scan.nextLine();
        System.out.print("index girin: ");
        int index= scan.nextInt();

        if (str.length()>index){
            System.out.println(str.charAt(index)); // 1. YOL
            System.out.println(str.substring(index,index+1)); // 2. YOL
        }else{
            System.out.println("girilen Stringten buyuk index girdiniz");
        }





    }
}
