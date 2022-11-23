package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        /*
        Saati saniyeye çeviren  method create ediniz

        Test Data:
        howManySeconds(2);
        Beklenen çıktı:
         7200
        */

        Scanner sc= new Scanner(System.in);
        System.out.print("Saati girin: ");
        int saat= sc.nextInt();

        howManySeconds(saat);


    }

    private static void howManySeconds(int saat) {

        int saniye= saat*3600;
        System.out.println(saat+" saat "+saniye+" saniyedir");
    }
}
