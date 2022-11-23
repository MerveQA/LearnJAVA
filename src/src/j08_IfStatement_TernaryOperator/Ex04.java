package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Girilen bir karakterin harf olup olmadigini kontrol eden kod create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char ch= sc.next().toLowerCase().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Girilen karakter harftir");
        }else {
            System.out.println("Girilen karakter harf degildir");
        }




    }
}
