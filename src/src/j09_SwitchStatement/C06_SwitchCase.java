package src.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        // Girilen haftanin gununu haftaici veya sonu oldugunuz print eden kod create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Hafta ismi girin : ");
        String gun= scan.nextLine().toLowerCase();

        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Yanlis isim girdiniz");
        }

    }
}
