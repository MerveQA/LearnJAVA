package src.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //TASK: Kullanicidan alinan sayilar ile bir int Array olusturan ve buyukten kucuge print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("kac elemanli array istiyorsun: ");
        int boyut= sc.nextInt();

        int arr[]=new int[boyut]; // boyutu belirlenmis bis int array olusturduk.

        for (int i = 0; i < boyut; i++) {
            System.out.print(i+". sayiyi girin: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Olusturulan Array: "+Arrays.toString(arr));

        Arrays.sort(arr);// kucukten buyuge siraladik

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

        /* HOCANIN COZUMU
         Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        int arrBoyut = sc.nextInt();

        int arr[] = new int[arrBoyut];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));



        Arrays.sort(arr);//arr k->b sortingen yapıldı..
        for (int i = arr.length-1 ;i>=0; i--) { //en buyuk sondaki elemandan döngü başlar
            System.out.print(arr[i] + " ");
        }
         */
    }


}
