package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz
        Şartlar:
        * Bir mail adresinde @ karakteri olmalı
        * Bir mail adresinde . (nokta) karakteri olmalı
        * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

        Örnekler
        validateEmail("@gmail.com")
        Çıktı : false

        validateEmail("gmail")
        Çıktı : false

        validateEmail("hello@gmail")
        Çıktı : false

        validateEmail("hello@edabit.com")
        Çıktı : true
        */

        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi girin: ");
        String mail = sc.nextLine();


        mailKontrol(mail);

    }

    public static void mailKontrol(String mail) {

        if (mail.contains("@") && mail.indexOf("@") < mail.indexOf(".") && mail.indexOf(mail.charAt(0)) < mail.indexOf("@")  ){
                System.out.println("Girilen mail adresi gecerli");
        }else {
            System.out.println("Gecerli bir mail adresi girin");
        }

    }


}