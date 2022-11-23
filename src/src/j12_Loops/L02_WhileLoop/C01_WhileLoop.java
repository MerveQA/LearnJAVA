package src.j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        Baslangic ve bitis degerleri net(bilinen degerler) olan tekrarlarda for loop ama
        adim sayisi belli olmayip bir sarta (duruma) bagli olan tekrarlarda while loop kullanilmali
         */

        // TASK-1: 11`den 20`ye kadar olan tam sayilari print eden code create ediniz...

        System.out.println("*** For Loop cozumu ***");

        for (int i = 11; i <21 ; i++) {
            System.out.print(i+" ");

        }

        System.out.println("\n*** While cozumu ***");

        int basla=11;  // while baslangic degeri

        while (basla<21){  // 21'den kucuk oldugu surece body'ye action uygula
            System.out.print(basla+" "); // uygulanacak action
            basla++; // while dongu degisim komutu
        }

        System.out.println();
        //TASK-2: 7 kere JavaCAN print eden code create edin.

        int a=1;
        while (a<8){
            System.out.println(a+". JavaCAN");
            a++;
        }

        //TASK-3: iki basamakli tek sayilari yan yana print eden code yazin

        int b=11;

        while (b<100){
            System.out.print(b+" ");
            b+=2;
        }

        // TASK-4: girilen metni terten while ile print eden code create ediniz

        Scanner sc= new Scanner(System.in);
        System.out.print("\nCumle girin: ");
        String cumle=sc.nextLine();

        int cumleUzunlugu= cumle.length()-1;

        while (cumleUzunlugu>=0){
            System.out.print(cumle.charAt(cumleUzunlugu));
            cumleUzunlugu--;
        }

        //TASK-5: Girilen sayiya kadar tam sayilarin toplamini print eden code create ediniz.

        System.out.print("tam sayi girin: ");
        int sayi= sc.nextInt();

        //int toplam=0; // while loop icerisinde kullanmak icin bos kutu atadik

        //while(sayi>0) { // sayi 0 olana kadar calis
        //    toplam += sayi; // her dongude sayiyi toplam kutusuna ekle
        //    sayi--; // her dongude sayiyi 1 azalt.
        //}
        //System.out.println("Toplam: "+toplam);


        //TASK-6: Girilen tam sayinin faktoryelini print eden code create ediniz.

        int faktoriyel=1;

        while (sayi>=1){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
}
