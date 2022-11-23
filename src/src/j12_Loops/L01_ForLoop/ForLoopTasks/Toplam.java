package src.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Toplam {

    public static void main(String[] args) {



//        //*** Odev01 ***
//        // 0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
//        //Not: 0 ve 100 dahildir.
//
//        //Kodu aşağıya yazınız.
//
//        for (int i = 0; i <=100 ; i++) {
//            if (i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//
//
//        //*** Odev02 ***
//        /*
//		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
//		 */
//        Scanner sc=new Scanner(System.in);
//        System.out.print("icerisinde rakam olan bir string giriniz: ");
//        String str= sc.nextLine();
//
//        String ch ;
//        int rakamAdet=0;
//        for (int i = 0; i < str.length(); i++) {
//            ch=str.substring(i,i+1);
//
//            if (ch.equals("9") || ch.equals("8")|| ch.equals("7")|| ch.equals("6")|| ch.equals("5")||
//                    ch.equals("4")|| ch.equals("3")|| ch.equals("2")|| ch.equals("1")|| ch.equals("0")){
//
//                rakamAdet++;
//            }
//        }
//        System.out.println("Girilen Stringte: "+rakamAdet+" adet rakam vardir");
//
//
//
//        //*** Odev03 ***
//        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
//         * bir method create ediniz.
//         *
//         *  getAsalMi(int sayi)
//         *  	return true/false
//
//         * */
//        public static void main(String[] args) {
//
//
//            System.out.print("bir sayi girin: ");
//            int sayi= sc.nextInt();
//
//            asalSayiMi(sayi);
//
//        }
//
//        private static void asalSayiMi(int sayi) {
//
//            int adet=0;
//
//            for (int i = 1; i <=sayi ; i++) {
//                if (sayi%i==0){
//                    adet++;
//                }
//            }
//
//            if (adet==2){
//                System.out.println(sayi+" sayisi asal sayidir.");
//            }else {
//                System.out.println(sayi+" sayisi asal sayi degildir.");
//            }
//        }
//
//
//
//        //*** Odev04 ***
//        /*
//        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.
//         */
//
//        //Kodu aşağıya yazınız.
//
//        for (int i = 0; i <=100 ; i++) {
//
//            if (i%5==0 && i%4==0){
//                System.out.println(i+" sayisi hem 5`e hemde 4` tam bolunen bir sayidir");
//            }
//
//        }
//
//
//
//        //*** Odev05 ***
//        /*
//        powerOfThree isminde bir method oluşturun.
//        Parametre olarak int
//        Return tipi boolean
//        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//        */
//
//        public static void main(String[] args) {
//
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Lutfen tamsayı giriniz: ");
//            int sayi= scan.nextInt();
//
//            boolean ucunUssu= powerOfThree (sayi);
//            System.out.println(ucunUssu);
//
//        }
//        public static boolean powerOfThree (int sayi) {
//
//            boolean ussuMu=true;
//            for (int i = 3; i <=sayi ; i*=3) {
//                if (sayi%i!=0){
//                    ussuMu=false;
//                }
//            }
//            return ussuMu;
//        }
//
//
//
//        //*** Odev06 ***
//        // İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
//
//        int toplam=0;
//
//        for (int i = 0; i <=10 ; i++) {
//            toplam+=i;
//
//        }
//        System.out.println(toplam);
//
//
//
//        //*** Odev07 ***
//        //        1
//        //        2 6
//        //        3 7 10
//        //        4 8 11 13
//        //        5 9 12 14 15
//
//        for (int i = 1; i <=5 ; i++) {
//            int a=i;
//            for (int j = 0; j < 5 ; j++) {
//
//                if (j<i){
//                    System.out.print(a+" ");
//                    a+=4-j;
//                }
//            }
//            System.out.println();
//        }
//
//
//        //*** Odev08 ***
//        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
//        99-98-97-96....
//        100 ve 0 dahil değildir.*/
//
//        for (int i = 100; i >=0 ; i--) {
//            if (i%2==1){
//                System.out.print(i+" ");
//            }
//        }
//
//
//
//        //*** Odev09 ***
//        /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
//         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
//         hesaplayan kodu yazınız.
//
//         Örnek Ekran Çıktısı
//        Girilen sayı=4
//        Kareler toplamı=30
//     */
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Bir tamsayı giriniz: ");
//        int sayi = scanner.nextInt();
//        int toplam = 0;
//
//        for (int i = 1; i <=sayi ; i++) {
//
//            toplam+=(i*i);
//            toplam=toplam;
//
//        }
//        System.out.println(toplam);
//

    }
}
