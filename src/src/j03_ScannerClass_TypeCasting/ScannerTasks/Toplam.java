package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

        // *** _22_Scanner1 ***
        /* kullanıcının ismini print eden code create ediniz */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.println("Isminiz: "+isim);


        // *** _23_Scanner2 ***
        // kullanıcının yasını print eden code create ediniz

        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();
        System.out.println("Yasiniz: "+yas);


        // *** _24_Scanner3 ***
        // kullanıcını sevdiği meyveyi print eden code create ediniz
        ;
        System.out.print("Lutfen sevdiginiz meyve ismini giriniz: ");
        String meyve= scan.nextLine();
        System.out.println("Sevdiginiz meyvenin ismi: "+meyve);


        // *** _25_Scanner4 ***
        /* kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        System.out.print("Lutfen arabanizdaki kapi sayisini giriniz: ");
        int kapiSayisi= scan.nextInt();

        System.out.println("Arabadaki kapi sayisi: "+kapiSayisi);


        // *** _26_Scanner5 ***
        /* kullanıcının 10 sene önceki yaşadığı şehri print eden code create ediniz.   */

        System.out.print("Lutfen 10 sene once yasadiginiz sehri giriniz: ");
        String sehir= scan.nextLine();

        System.out.println("10 sene once yasadiginiz sehir: "+sehir);


        // *** _27_Scanner6 ***
        /* kullanıcının Doğum gününü print eden code create ediniz */

        System.out.print("Lutfen dogum gununuzu gun ay yil olarak giriniz: ");
        String dogumGunu= scan.nextLine();
        System.out.println("Dogum gununuz: "+dogumGunu);


        // *** _28_Scanner7 ***
        /*
         Bir boolean oluşturunuz.
         Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
         Varsa True , yoksa False olarak  konsoldan cevap veriniz.
         Boolean'ı yazdırınız.
         */

        boolean varMi;
        System.out.println("Bir Banka Hesabınız Var mı ? \nVar ise true, yok ise false giriniz");
        varMi = scan.nextBoolean();

        System.out.println(varMi);


        // *** _29_Scanner9 ***
        /* kullanıcının boyunu Float print eden code create ediniz   */

        System.out.print("Lutfen boyunuzu giriniz: ");
        float boy= scan.nextFloat();

        System.out.println("Boyunuz: "+boy);


        // *** _30_Scanner8 ***
         /*
        Bir byte oluşturunuz.
        Konsola kg cinsinden bir ağırlık yazınız.
        Byte'ı yazdırınız.
        */

        byte kilo;
        System.out.print("Lutfen kg cinsinden kilonuzu giriniz: ");
        kilo= scan.nextByte();

        System.out.println("Boyunuz: "+kilo);


        // *** Task01 ***
        /*
        TASK-> Ask user to enter mid-term grade, final grade, and project grade Calculate the general grade
		       (mid-term : 30% , project : 20%, final : 50%)

		Example: INPUT: mid-term grade (ara sınav notu) =78
		      		    final grade (final grade) =66
		      		    project grade (proje notu) =90
		         OUTPUT: "Your grade is : 81,6"
		 */

        System.out.print("Lutfen ara sinav notunuzu giriniz: ");
        int araSinavNotu= scan.nextInt();
        System.out.print("Lutfen final notunuzu giriniz: ");
        int finalNotu= scan.nextInt();
        System.out.print("Lutfen proje notunuzu giriniz: ");
        int projeNotu= scan.nextInt();

        System.out.println("Genel notunuz: "+ (araSinavNotu*0.3+finalNotu*0.5+projeNotu*0.2));


        // *** Task02 ***
        /*
         TASK -> Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
                 ve vucut kutle endeksini bulun.
                 Sonucu tamsayi ve ondalikli sayi olarak yazdirin

            VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir

         Ornek : Input : boy :180 kilo : 80
                 Output : Vucut kutle endeksiniz : 24
                          Vucut kutle endeksiniz : 24.691…
        */

        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        double boy1= scan.nextInt();
        System.out.print("Lutfen kilonuzu kg olarak giriniz: ");
        int kilo1= scan.nextInt();

        double vucutKutleEndeksi= kilo1/((boy1/100)*(boy1/100));
        int intVke= (int) vucutKutleEndeksi;

        System.out.println("Ondalikli VKE: "+vucutKutleEndeksi);
        System.out.println("Tamsayi VKE: "+intVke);


        // *** Task03 ***
        /*
          TASK-> Kullaniciya gunde kac saat uyudugunu sorun,
                 ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin

          Ornek : Input : 8
                  Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        System.out.print("Gunde kac saat uyuyorsunuz: ");
        double saat= scan.nextInt();

        double ayda= 30*saat/24;
        double yilda= saat*365/24;

        System.out.println("Ayda: "+ayda+" gun, yilda: "+yilda+" gun, 40 yilda: "+yilda*40+" gun uykuda geciyor.");


        // *** Task04 ***
        /* TASK -> Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
                  bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
        */
        System.out.print("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad= scan.nextLine();
        System.out.print("Lutfen yasinizi giriniz: ");
        int yass= scan.nextInt();
        System.out.print("Lutfen kilonuzu kg olarak giriniz: ");
        double kiloo= scan.nextInt();
        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        int boyy= scan.nextInt();
        System.out.print("Lutfen salonumuza devam edeceğiniz sureyi ay olarak giriniz: ");
        int devamSuresi= scan.nextInt();

        System.out.println("Salonumuza kayit yaptiran musterinin:\nAdi soyadi: "+adSoyad+"\nYasi: "+
                           yass+"\nKilosu: "+kiloo+" kg\nBoyu: "+boyy+" cm\nSalona devam edecegi sure: "+
                           devamSuresi+ " ay\nOdeyecegi toplam ucret: "+devamSuresi*20+" $");


        // *** Task05 ***
        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        System.out.print("Lutfen tamsayi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen 2. tamsayiyi giriniz: ");
        int sayi2= scan.nextInt();

        System.out.println("Toplama: "+(sayi1+sayi2));
        System.out.println("Cikarma: "+(sayi1-sayi2));
        System.out.println("Carpma: "+(sayi1*sayi2));
        System.out.println("Bolme: "+(sayi1/sayi2));


        // *** Task06 ***
        /*
        Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13
        */
        int kisaKenar= 5;
        int uzunKenar= 12;
        int hipotenuz= (5*5)+(12*12);

        System.out.println("Hipotenuz: "+Math.sqrt(hipotenuz));


        // *** Task07 ***
         /*
        Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
                120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
       */
        System.out.print("Mesafeyi giriniz: ");
        int mesafe= scan.nextInt();
        System.out.print("Hızı giriniz: ");
        int hiz= scan.nextInt();

        System.out.println("Sure: "+mesafe/hiz+" saattir.");


        // *** Task08 ***
        /*
          Kullanicidan alacaginiz vize1 vize2 ve final notlarini
          vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        System.out.print("Lutfen 1. vize notunuzu giriniz: ");
        int birinciVize= scan.nextInt();
        System.out.print("Lutfen 2. vize notunuzu giriniz: ");
        int ikinciVize= scan.nextInt();
        System.out.print("Lutfen final notunuzu giriniz: ");
        int finalNotu1= scan.nextInt();

        int vizeOrt= (birinciVize+ikinciVize)/2;
        System.out.println("Gecme notunuz: "+(vizeOrt*0.3+finalNotu1*0.7));


        // *** Task09 ***
        /*
        Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        System.out.print("a sayısını giriniz: ");
        double a= scan.nextInt();
        System.out.print("b sayısını giriniz: ");
        double b= scan.nextInt();
        System.out.print("c sayısını giriniz: ");
        double c= scan.nextInt();

        System.out.println("Sonuc: "+ (((a*a)-(b*b))/3*c));


        // *** Task10 ***
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazınız.
        // formula: c = (f-32)*5/9

        System.out.print("Lutfen Santigrat`a cevirmek istediginiz Fahrenhayt sicakligini giriniz: ");
        int fahrDer = scan.nextInt();

        double celsius= (fahrDer-32)*5/9;

        System.out.println("Girdiginiz "+fahrDer+" Fahrenhayt "+celsius+" Santigrattir");

    }
}
