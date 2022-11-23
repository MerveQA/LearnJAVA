package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak yazdırınız.
        */

        Scanner scan =new Scanner(System.in);

        int sayi []= new int[6];

        for (int i = 0; i < sayi.length; i++) {
            System.out.print(i+1+". elemani girin:  ");
            sayi[i]=scan.nextInt();

        }

        System.out.println("Girilen tek sayilar: "+tekElemanlar(sayi));

    }

    private static List<Integer> tekElemanlar(int[] sayi) {

        List<Integer> tekSayiList= new ArrayList<>();

        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i]%2==1){

                tekSayiList.add(sayi[i]);
            }
        }

      return tekSayiList;
    }
}
