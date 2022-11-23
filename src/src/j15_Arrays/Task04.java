package src.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        // TASK: girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("kac elemanli array istiyorsun: ");


        int arr[]=new int[sc.nextInt()]; // boyutu belirlenmis bis int array olusturduk.

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". sayiyi girin: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Girilen sayilardan olusan Array: "+Arrays.toString(arr));

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        int ortalam= toplam/arr.length;
        System.out.println("Girilen sayilarin toplami: "+toplam);

        int ortalamayiGecenElemanSayisi=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalam){
                ortalamayiGecenElemanSayisi++;
            }
        }

        System.out.println("Girilen sayilarin ortalamasini gecen eleman sayisi: "+ortalamayiGecenElemanSayisi);




    }
}
