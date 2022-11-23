package src.j25_Encapsulation.task05.MyCozum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad= sc.nextLine();
        System.out.print("Ne kadar maas istiyorsunuz? ");
        int maas =sc.nextInt();
        System.out.println("Dogum tarihinizi belirtilen gormatta giriniz => gg/aa/yyyy");
        String dogumTarihi =sc.next();

        Employees calisan1 =new Employees();
        calisan1.setName(ad);
        calisan1.setSalary(maas);
        calisan1.setDob(dogumTarihi);

        calisan1.menu();

    }
}
