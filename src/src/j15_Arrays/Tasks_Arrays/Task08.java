package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        //Task-> girilen 7 elemanlı bir int arrayın tek elemanlarını print eden code create ediniz.

        int arr[]= {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(); //dummy
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }

        //Kullanicidan deger alarak cozumu

        Scanner sc=new Scanner(System.in);
        System.out.print("Kac elemanli Array olusturmak istiyorsunuz: ");
        int boyut= sc.nextInt();

        int arrYeni[]=new int[boyut]; // Burada kullanicinin belrttigi adet buyuklugunde Array olusturuldu

        for (int i = 0; i < boyut; i++) { // Burada da kullanicinin belirttigi boyut kadar tek tek Array
            // elemanlari kullanicidan alinip bos Array kutusuna yerlestirildi
            System.out.print(i+". indexdeki sayiyi girin: ");
            arrYeni[i]=sc.nextInt();
        }

        System.out.println("Olusturulan Array: "+ Arrays.toString(arrYeni)); // Burada kullanicinin olusturdugu Array yazdirildi

        for (int i = 0; i < arrYeni.length; i++) {

            if (arrYeni[i]%2!=0){
                System.out.print(arrYeni[i]+" ");
            }
        }

        System.out.println(); // Dummy
    }
}
