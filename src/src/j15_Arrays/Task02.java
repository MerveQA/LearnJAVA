package src.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // TASK: girilen int array elemanlarin toplamini print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Kac elemanli bir Array olusturmak istiyorsunuz: ");
        //int boyut= sc.nextInt();

        int arr[]=new int[sc.nextInt()]; // burada kullanicidan alinan array boyutu direkt array boyut kismina tanimladik.

        for (int i = 0; i < arr.length; i++) { // burada yeni olusturdugumuz arraye kullanicidan alinan degerler atandi
            System.out.print(i+". index sayiyi girin: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("\narr[]= "+Arrays.toString(arr));

        int arrToplam=0;

        for (int i = 0; i < arr.length; i++) { // burada olusturulan arrayin elemanlari tek tek toplandi ve toplama eklendi
            arrToplam+=arr[i];
        }

        System.out.println("arr[] Toplam= "+arrToplam);

        // foreach methoduyla cozum

        int arrToplam1=0;

        for (Integer w :arr ) {
            arrToplam+=w;
        }

        System.out.println("foreach Toplam= "+arrToplam1);
    }
}
