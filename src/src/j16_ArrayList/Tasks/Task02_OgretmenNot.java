package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02_OgretmenNot {
    public static void main(String[] args) {

        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        List<Integer> notlarList= new ArrayList<>();

        int not=0;
        int toplam=0;
        int sayac=0;

        while (not!=-1){
            System.out.print("Notu Giriniz.\nCikmak icin -1 tuslayiniz:");
            not= scan.nextInt();

            if (not!=-1){
                notlarList.add(not);
                toplam+=not;
                sayac++;
            }
        }

        int ortalamaNot=toplam/sayac;

        List<Integer> ortGecenOgr= new ArrayList<>();
        sayac=0;
        for (int i = 0; i < notlarList.size(); i++) {
            if (notlarList.get(i) >= ortalamaNot) {
                ortGecenOgr.add(notlarList.get(i));
                sayac++;
            }
        }
        System.out.println("Tum Ogrencilerin Notlari: "+notlarList);
        System.out.println("Ortalamayi Gecen Ogrencilerin Notlari: "+ortGecenOgr);
        System.out.println(ortalamaNot+" ortalamasini Gecen Ogrenci Sayisi: "+sayac);








    }
}
