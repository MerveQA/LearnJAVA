package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         TASK -> Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
                 ve vucut kutle endeksini bulun.
                 Sonucu tamsayi ve ondalikli sayi olarak yazdirin

            VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir

         Ornek : Input : boy :180 kilo : 80
                 Output : Vucut kutle endeksiniz : 24
                          Vucut kutle endeksiniz : 24.691…
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        double boy= scan.nextInt();
        System.out.print("Lutfen kilonuzu kg olarak giriniz: ");
        int kilo= scan.nextInt();


        double vucutKutleEndeksi= kilo/((boy/100)*(boy/100));
        int intVke= (int) vucutKutleEndeksi;


        System.out.println("Ondalikli VKE: "+vucutKutleEndeksi);
        System.out.println("Tamsayi VKE: "+intVke);


    }
}
