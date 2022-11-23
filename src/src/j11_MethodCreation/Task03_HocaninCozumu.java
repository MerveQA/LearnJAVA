package src.j11_MethodCreation;

import java.util.Scanner;

public class Task03_HocaninCozumu {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = sc.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = sc.nextDouble();
        System.out.print("işleminizi giriniz : ");
        char islem = sc.next().charAt(0);

        islemMenu(islem, (int) sayi1, (int) sayi2);
    }//main sonu

    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+' : toplama(x, y); break;
            case '-' : cikarma(x, y); break;
            case '*' : carpma(x, y); break;
            case '/' : bolme(x, y); break;
            default: System.out.println("Hatali seçim yaptınız");
        }
    }

    public static void toplama(int a, int b) {

        System.out.println("a+b = " + (a + b));
    }

    public static void carpma(int a, int b) {

        System.out.println("a*b = " + (a * b));
    }

    public static void cikarma(int a, int b) {

        System.out.println("a-b = " + (a - b));
    }

    public static void bolme(int a, int b) {

        System.out.println("a/b = " + (a / b));
    }


}
