package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
     /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

      */

        Scanner sc=new Scanner(System.in);
        System.out.print("100`den kucuk bir pozitif tam sayi giriniz: ");
        int sayi = sc.nextInt();

        if (sayi <= 100) {
            for (int i = 1; i <sayi ; i++) {

                if (i%3==0 && i%5==0){ // 3`e ve 5`e bolunme kontrolu
                    System.out.println("JavaCAN");
                }else if (i%5==0){ // 5`e bolunme kontrolu
                    System.out.println("CAN");
                } else if (i%3==0 ) { // 3`e bolunme kontrolu
                    System.out.println("Java");
                } else { //3`e, 5`e ve hem 3`e hem 5`e bolunemeyen sayilar
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("100`den kucuk bir tam sayi girin");
        }





    }
}
