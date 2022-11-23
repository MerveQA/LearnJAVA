package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {

     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("FIBONACCI dizisi icin bir sayi girin: ");
        int sayi= sc.nextInt();

        int n1=0;
        int n2=1;
        int n3;

        System.out.print(n2); // sayi 1`i forda kullanamadigimiz icin yazima ekledik
        for (int i = 2; i <= sayi ; i++) {

            n3=n1+n2;
            System.out.print("-"+n3);
            n1=n2;
            n2=n3;
        }


    }



}
