package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("sayi girive gari");
        int sayi= sc.nextInt();

        if (sayi>=0){
            if (sayi>10){
                System.out.println("buyuksun baba");
            }else{
                System.out.println("normalsin");
            }
        }else{
            if (sayi>-10){
                System.out.println("negatifsin baba");
            }else{
                System.out.println("cok negatifsin be");
            }
        }




    }
}
