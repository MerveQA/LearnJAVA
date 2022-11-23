package src.j08_IfStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q16 {
        /*
        TASK :
        Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
        en kucuk olanlarini konsola yazdiriniz
        int num1
        int num2
        int num3
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Aralarda enter tusuna basarak 3 sayi giriniz");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();

        if (m1>m2 && m2>m3){
            System.out.println("Minimum sayi: "+ m3);
        } else if (m1>m3 && m3>m2){
            System.out.println("Minimum sayi: "+ m2);
        } else if (m2>m1 && m1>m3){
            System.out.println("Minimum sayi: "+ m3);
        }else if (m2>m3 && m3>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m2 && m2>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m1 && m1>m2){
            System.out.println("Minimum sayi: "+ m2);
        }

    }
}

