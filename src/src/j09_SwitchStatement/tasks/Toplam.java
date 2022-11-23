package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

        // **** Task01 ****
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();

        int onlarBasamagi=(sayi/10)%10;

        switch (onlarBasamagi){
            case 0 :
                System.out.println("Girilen sayinin onlar basamaği SIFIR");
                break;
            case 1 :
                System.out.println("Girilen sayinin onlar basamaği BIR");
                break;
            case 2 :
                System.out.println("Girilen sayinin onlar basamaği IKI");
                break;
            case 3 :
                System.out.println("Girilen sayinin onlar basamaği UC");
                break;
            case 4 :
                System.out.println("Girilen sayinin onlar basamaği DORT");
                break;
            case 5 :
                System.out.println("Girilen sayinin onlar basamaği BES");
                break;
            case 6 :
                System.out.println("Girilen sayinin onlar basamaği ALTI");
                break;
            case 7 :
                System.out.println("Girilen sayinin onlar basamaği YEDI");
                break;
            case 8 :
                System.out.println("Girilen sayinin onlar basamaği SEKIZ");
                break;
            case 9 :
                System.out.println("Girilen sayinin onlar basamaği DOKUZ");
        }


        // **** Task02 ****
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız

        Scanner scn = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\nHaftanın kaçıncı gününde olduğunu giriniz : ");
        int kacinciGun = scn.nextInt();

        if (kacinciGun>0 && kacinciGun<8){
            int HedefGun = (100+kacinciGun)%7;

            switch (HedefGun) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                    break;
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 7:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("Yanlis isim girdiniz");
            }
        }else{
            System.out.println("Gecerli bir gun numarasi girin");
        }


        // **** Task03 ****
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis sayi girdiniz");
        }


        // **** Task04 ****
        // Girilen  ayın  kac cektigini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("ayNo = ");
        int ayNo = input.nextInt();

        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 cekiyor");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 cekiyor");
                break;
            case 2:
                System.out.print("Yili giriniz: ");
                int yil=oku.nextInt();
                if (yil%4==0){
                    System.out.println("Girilen ay 29 cekiyor");
                }else{
                    System.out.println("Girilen ay 28 cekiyor");
                }
                break;
            default:
                System.out.println("Yanlis ay no girdiniz");
        }



        // **** Task05 ****
        /*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scann = new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        int not = scann.nextInt();

        int harfDegeri = 0;

        if (not>=0 && not<50){
            harfDegeri=1;
        } else if (not>=50 && not<60) {
            harfDegeri=2;
        }else if (not>=60 && not<80) {
            harfDegeri=3;
        }else if (not>=80 && not<101) {
            harfDegeri=4;
        }else {
            System.out.println("Gecerli not giriniz");
        }

        switch (harfDegeri){
            case 1:
                System.out.println("notunuz D");
                break;
            case 2:
                System.out.println("notunuz C");
                break;
            case 3:
                System.out.println(" notunuz B");
                break;
            case 4:
                System.out.println("notunuz A");
                break;
        }


        // **** Task06 ****
        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

        Scanner scan1 = new Scanner(System.in);
        System.out.print("VIP kisaltmasindaki harflerden birini girin : ");
        String input1= scan1.nextLine().toUpperCase();

        switch (input1){
            case "V":
                System.out.println("Very");
                break;
            case "I":
                System.out.println("Important");
                break;
            case "P":
                System.out.println("Person");
                break;
            default:
                System.out.println("Hatali giris");
        }


        // **** Task07 ****
        // 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..

        Scanner scan3 = new Scanner(System.in);
        System.out.print("uc basamakli sayi giriniz :");
        int sayi1 = scan3.nextInt();

        int birler= sayi1%10;
        int onlar= (sayi1/10)%10;
        int yuzler= (sayi1/100)%10;

        switch (yuzler){
            case 0 :
                break;
            case 1 :
                System.out.println("Yuz");
                break;
            case 2 :
                System.out.println("Ikiyuz");
                break;
            case 3 :
                System.out.println("Ucyuz");
                break;
            case 4 :
                System.out.println("Dortyuz");
                break;
            case 5 :
                System.out.println("Besyuz");
                break;
            case 6 :
                System.out.println("Altiyuz");
                break;
            case 7 :
                System.out.println("Yediyuz");
                break;
            case 8 :
                System.out.println("Sekizyuz");
                break;
            case 9 :
                System.out.println("Dokuzyuz");
                break;
        }
        switch (onlar){
            case 0 :
                break;
            case 1 :
                System.out.println("On");
                break;
            case 2 :
                System.out.println("Yirmi");
                break;
            case 3 :
                System.out.println("Otuz");
                break;
            case 4 :
                System.out.println("Kirk");
                break;
            case 5 :
                System.out.println("Elli");
                break;
            case 6 :
                System.out.println("Altmis");
                break;
            case 7 :
                System.out.println("Yetmis");
                break;
            case 8 :
                System.out.println("Seksen");
                break;
            case 9 :
                System.out.println("Doksan");
                break;
        }
        switch (birler){
            case 0 :
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
        }

        // **** Task_SeyahatProjesi ****
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

        todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.

        İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM --- Köln : 80 KM ---
        (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

        1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

        todo Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

        Rota = Frankfurt yazdırın.
        Frankfurt km hesabı işlemi yapın.

        son olarak konsolda: Frankfurt 15 Euro yazsın.

        todo  case: KÖLN ise
        "Rota = Köln" yazdırın.
        km hesabına göre işlemi yapınız.

       son olarak konsolda: Köln 20 Euro yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):"   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,
          bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi

        double bakiye= 100;

        if (hedef.equals("KOLN")){
            System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir): ");
            int biletSayisi=scan.nextInt();
            switch (biletSayisi){
                case 1:
                    int faura= (80/20)*5;
                    System.out.println("Rotaniz = Koln\nKisi basi: "+faura+" euro");
                    System.out.println("Faturaniz: "+faura+" euro");
                    System.out.println("Para ustunuz: "+(bakiye-faura)+" euro");
                    break;
                case 2:
                    faura= (80/20)*5;
                    System.out.println("Rotaniz = Koln\nKisi basi: "+faura+" euro");
                    System.out.println("2 Kisilik bilet aldiniz");
                    System.out.println("Faturaniz: "+(2*faura)+" euro");
                    System.out.println("Para ustunuz: "+(bakiye-(2*faura))+" euro");
                    break;
            }
        }else if (hedef.equals("FRANKFURT")){
            System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir): ");
            int biletSayisi=scan.nextInt();
            switch (biletSayisi){
                case 1:
                    int faura= (60/20)*5;
                    System.out.println("Rotaniz = Frankfurt\nKisi basi: "+faura+" euro");
                    System.out.println("1 Kisilik bilet aldiniz");
                    System.out.println("Faturaniz: "+faura+" euro");
                    System.out.println("Para ustunuz: "+(bakiye-faura)+" euro");
                    break;
                case 2:
                    faura= (60/20)*5;
                    System.out.println("Rotaniz = Frankfurt\nKisi basi: "+faura+" euro");
                    System.out.println("2 Kisilik bilet aldiniz");
                    System.out.println("Faturaniz: "+(2*faura)+" euro");
                    System.out.println("Para ustunuz: "+(bakiye-(2*faura))+" euro");
                    break;
            }
        }else{
            System.out.println("Yanlis rota girdiniz");
        }
    }
}
