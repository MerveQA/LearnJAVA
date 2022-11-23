package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

    /*
    Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı
   */
        Scanner scan= new Scanner(System.in);
        System.out.print("Password girisi yapin: ");
        String password= scan.nextLine();

        if ((password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') && (password.length() >= 6) &&
                (password.charAt(password.length() - 1) <= '9' && password.charAt(password.length() - 1) >= '0')){
            System.out.println("Gecerli sifre");
        }else{
            System.out.println("Gecersiz sifre");
        }

    }
}
