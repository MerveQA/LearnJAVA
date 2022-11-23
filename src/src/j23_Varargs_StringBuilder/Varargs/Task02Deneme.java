package src.j23_Varargs_StringBuilder.Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02Deneme {
    public static void main(String[] args) {

        // Kullanicinin istedigi kadar girecegi sayiyi varargs yontemiyle toplayan method

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sayi = new ArrayList<>();

        int aa =1;
        while (aa!=0) {
            System.out.println("sayi giriniz\nCikmak icin 0 tuslayiniz: ");
            aa = sc.nextInt();
            sayi.add(aa);
            }

        Integer[] arr = sayi.toArray(new Integer[0]);  // listi arraye ceviriyor ??
        System.out.println("hesapla(sayi) = " + hesapla(arr));

    }  //main sonu

    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 0; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        return x;
    }





}
