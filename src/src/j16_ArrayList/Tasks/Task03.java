package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Bir lisste istenen sayinin varligini kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner scan= new Scanner(System.in);
        System.out.print("Hangi sayiyi ariyorsun: ");
        int sayi=scan.nextInt();
        boolean varMi= false;

        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i)==sayi){
                varMi=true;
                System.out.println("Agam sayi bizde mecuttur.");
                break;
            }
        }
        if (!varMi){
            System.out.println("Agam sayi bizde yoktur.");
        }


        // 2.YOL:

        for (int i = 0; i < listSayi.size(); i++) {

            if (listSayi.contains(sayi)){
                System.out.println("var");
                break;
            }else {
                System.out.println("yok");
            }

        }





    }
}
