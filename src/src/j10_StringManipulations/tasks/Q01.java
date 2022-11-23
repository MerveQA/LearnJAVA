package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String cumle= scan.nextLine().toLowerCase();

        if (cumle.contains(" ")){
            System.out.println("Kullanıcıdan alacağımiz string en az bir boşluk karakteri ICERMEKTEDIR.");
        }else {
            System.out.println("Kullanıcıdan alacağımiz string boşluk karakteri ICERMEMEKTEDIR.");
        }


    }
}

