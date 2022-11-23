package src.j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //TASK: Girilen iki sayiyi secilen dort isleme gore hesaplayan method create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi 1`i girin: ");
        int sayi1= sc.nextInt();
        System.out.print("Sayi 2`yi girin: ");
        int sayi2= sc.nextInt();
        System.out.print("Yapmak istediginiz dort islemden birini seciniz-> (+), (-), (*), (/):");
        char islem= sc.next().charAt(0);


        dortIslem(islem,sayi1,sayi2);
        dortIslem('*',25,10); // 250


    }

    private static void dortIslem(char i, int a, int b) {

        switch (i){
            case '+': System.out.println("Toplama: "+(a+b)); break;
            case '-': System.out.println("Cikarma: "+(a-b)); break;
            case '*': System.out.println("Carpma: "+(a*b)); break;
            case '/': System.out.println("Bolme: "+(a/b)); break;
            default: System.out.println("Hatali secim yaptiniz.");
        }

    }


}
