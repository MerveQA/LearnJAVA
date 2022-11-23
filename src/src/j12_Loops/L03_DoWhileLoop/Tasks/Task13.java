package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
                do-while lopp
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char ch;

        do {
            System.out.println("javaCAN");
            System.out.print("Tekrar karakter girin: ");
            ch = sc.next().toLowerCase().charAt(0);

        }while (ch!='x');

        System.out.println("jAVATAR");

    }
}
