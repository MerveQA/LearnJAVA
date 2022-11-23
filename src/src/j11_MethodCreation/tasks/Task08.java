package src.j11_MethodCreation.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        /*
        Kullanıcı tarafından girilen bir yılın  artık yıl olup
        olmadığını kontrol eden method create ediniz

        Test Data:
        2017

        Beklenen Çıktı:
        false
        */

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir yil girin: ");
        int yil= sc.nextInt();

        artikYil(yil);

    }

    private static void artikYil(int yil) {

        if (yil%4==0){
            System.out.println(yil+" yili Artik Yildir");
        }else{
            System.out.println(yil+" yili Artik Yil Degildir");
        }

    }
}
