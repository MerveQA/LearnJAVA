package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        /*
        Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

        Test data:
        12,24,34

        Beklenen Çıktı:
        12
        */
        Scanner sc= new Scanner(System.in);
        System.out.print("Birinci sayiyi girin: ");
        int sayi1= sc.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        int sayi2= sc.nextInt();
        System.out.print("Ucuncu sayiyi girin: ");
        int sayi3= sc.nextInt();

        System.out.println("Girilen sayilar: "+sayi1+", "+sayi2+", "+sayi3);
        enKucukSayiyiBul(sayi1,sayi2,sayi3);
    }

    private static void enKucukSayiyiBul(int sayi1, int sayi2, int sayi3) {

        if (sayi1>sayi2 && sayi2>sayi3){
            System.out.println("Minimum sayi: "+ sayi3);
        } else if (sayi1>sayi3 && sayi3>sayi2){
            System.out.println("Minimum sayi: "+ sayi2);
        } else if (sayi2>sayi1 && sayi1>sayi3){
            System.out.println("Minimum sayi: "+ sayi3);
        }else if (sayi2>sayi3 && sayi3>sayi1){
            System.out.println("Minimum sayi: "+ sayi1);
        }else if (sayi3>sayi2 && sayi2>sayi1){
            System.out.println("Minimum sayi: "+ sayi1);
        }else if (sayi3>sayi1 && sayi1>sayi2){
            System.out.println("Minimum sayi: "+ sayi2);
        }

    }


}

