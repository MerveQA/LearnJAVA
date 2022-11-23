package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class toplam {

    //// *** _01_method1 ***
    ///*
    //Ismi randomNum olan bir method oluşturun.
    //Parametre olarak int max almalı.
    //Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    //Random numarayı döndürünüz.
    //Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    //Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
    // */
//
    //public static void main(String[] args) {
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Random bir sayi elde etmek max degeri girin: ");
    //    int max= sc.nextInt();
//
    //    System.out.println("Girilen max deger: "+max);
    //    int randomSayi= randomNum(max);
    //    System.out.println("randomSayi = " + randomSayi);
    //}
//
    //public static int randomNum(int a) {
    //    int randomNum = (int)(Math.random() * a);
//
    //    return randomNum;
    //}
//
    //// *** _12_method12 ***
    // /*
    //powerOfThree isminde bir method oluşturun.
    //    Parametre olarak int
    //    Return tipi boolean
    //    Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//
    //    Örnek 1:
    //    Girdi: 27
    //    Çıktı: true
    //    Açıklama: 3*3*3 =27
    //    Sonuç= true
//
    //    Örnek 2:
    //    Girdi: 0
    //    Çıktı: false
//
    //    Örnek 3:
    //    Girdi: 9
    //    Çıktı: true
    //    Açıklama: 3*3 = 9
    //    Sonuç= true
//
    //    Örnek 4:
    //    Girdi: 45
    //    Çıktı:: false
    //    Açıklama: 3*3*3*3 =81
    //    Sonuç= false
    //    45, 3ün üssü (kuvveti) değildir.
    // */
//
    //public static void main(String[] args) {
//
    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("Lutfen tamsayı giriniz: ");
    //    int sayi= scan.nextInt();
//
    //    boolean ucunUssu= powerOfThree (sayi);
    //    System.out.println(ucunUssu);
//
    //}
    //public static boolean powerOfThree (int sayi) {
//
    //    boolean ussuMu = false;
    //    while (sayi >3) {
    //        sayi /= 3;
    //    }
    //    if (sayi%3 == 0) ussuMu = true;
    //    return ussuMu;
    //}
//
    //// *** Task03 ***
    //public static void main(String[] args) {
    //    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    //    // ceviren bir method yaziniz.
//
    //    // 1 mil= 1.609344 km
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Once tam saati girin enter`a basip dakikayi girin: ");
    //    int saat= sc.nextInt();
    //    int dakika= sc.nextInt();
    //    System.out.print("Mil biriminde uzunluk girin: ");
    //    double mil= sc.nextDouble();
    //    System.out.print("Kilogram cinsinde agirlik girin: ");
    //    double kg= sc.nextDouble();
//
    //    saatiSaniyeyeCevirme(saat, dakika);
    //    miliKilometreyeCevirme(mil);
    //    kilogramiGramaCevirme(kg);
//
    //}
//
    //private static void kilogramiGramaCevirme(double kg) {
    //    double gram= kg*1000;
    //    System.out.println(kg+" kilogram = "+gram+" gramdir");
    //}
//
    //private static void miliKilometreyeCevirme(double mil) {
    //    double km= mil*1.609344;
    //    System.out.println(mil+" mil = "+km+" kilometredir");
    //}
//
    //private static void saatiSaniyeyeCevirme(int saat, int dakika) {
//
    //    int saniye= (saat*3600)+(dakika*60);
    //    System.out.println(saat+" saat "+dakika+" dakika = "+saniye+" saniyedir");
    //}
//
//
    //// *** Task06 ***
    //public static void main(String[] args) {
	//	/*
	//	 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
	//	 ve iki sayı seçmesini söyleyin.
    //     Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	//	 */
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("paralelkenar icin -> 1\ndikdortgen icin-> 2\nucgen icin-> 3 \nsayilarindan birini girin: ");
    //    int secim = sc.nextInt();
//
    //    switch (secim){
    //        case 1:
    //            System.out.print("Paralel kenarin bir kenar uzunlugunu girin: ");
    //            int a= sc.nextInt();
    //            System.out.print("Paralel kenarin taban uzunlugunu girin : ");
    //            int b= sc.nextInt();
    //            System.out.print("Paralel kenarin yuksekligini girin: ");
    //            int h= sc.nextInt();
    //            paralelkenarAlanVeCevreHesaplama(a,b,h);
    //            break;
    //        case 2:
    //            System.out.print("Dikdörtgenin kisa kenarinin uzunlugunu girin: ");
    //            int kisa= sc.nextInt();
    //            System.out.print("Dikdörtgenin uzun kenarinin uzunlugunu girin: ");
    //            int uzun= sc.nextInt();
    //            dikdortgenAlanVeCevreHesaplama(kisa, uzun);
    //            break;
    //        case 3:
    //            System.out.print("Ucgenin birinci kenar uzunlugunu girin: ");
    //            int sayi1= sc.nextInt();
    //            System.out.print("Ucgenin ikinci kenar uzunlugunu girin: ");
    //            int sayi2= sc.nextInt();
    //            System.out.print("Ucgenin taban uzunlugunu girin: ");
    //            int sayi3= sc.nextInt();
    //            System.out.print("Ucgenin yuksekligini girin: ");
    //            int yukseklik= sc.nextInt();
    //            ucgenAlanVeCevreHesaplama(sayi1, sayi2, sayi3, yukseklik);
    //            break;
    //        default:
    //            System.out.println("Hatali giris !!!\nTekrar deneyin... ");
    //    }
//
    //}
//
    //private static void ucgenAlanVeCevreHesaplama(int a, int b, int c, int h) {
    //    int cevre = a + b + c;
    //    double alan= (double) (c*h/2);
//
    //    System.out.println("Ucgenin cevresi= "+cevre+", Alani= "+alan);
    //}
//
    //private static void dikdortgenAlanVeCevreHesaplama(int kisa, int uzun) {
    //    int cevre= 2*(kisa+uzun);
    //    int alan= kisa*uzun;
    //    System.out.println("Dikdortgenin cevresi= "+cevre+", Alani= "+alan);
    //}
//
    //private static void paralelkenarAlanVeCevreHesaplama(int a, int b, int h) {
//
    //    int cevre= 2*(a+b);
    //    double alan= (double) (b*h/2);
    //    System.out.println("Paralelkenarin cevresi= "+cevre+", Alani= "+alan);
    //}
//
    //// *** Task07 ***
    //public static void main(String[] args) {
//
    //    /*
    //    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz
//
    //    Test data:
    //    12,24,34
//
    //    Beklenen Çıktı:
    //    12
    //    */
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Birinci sayiyi girin: ");
    //    int sayi1= sc.nextInt();
    //    System.out.print("Ikinci sayiyi girin: ");
    //    int sayi2= sc.nextInt();
    //    System.out.print("Ucuncu sayiyi girin: ");
    //    int sayi3= sc.nextInt();
//
    //    System.out.println("Girilen sayilar: "+sayi1+", "+sayi2+", "+sayi3);
    //    enKucukSayiyiBul(sayi1,sayi2,sayi3);
    //}
//
    //private static void enKucukSayiyiBul(int sayi1, int sayi2, int sayi3) {
//
    //    if (sayi1>sayi2 && sayi2>sayi3){
    //        System.out.println("Minimum sayi: "+ sayi3);
    //    } else if (sayi1>sayi3 && sayi3>sayi2){
    //        System.out.println("Minimum sayi: "+ sayi2);
    //    } else if (sayi2>sayi1 && sayi1>sayi3){
    //        System.out.println("Minimum sayi: "+ sayi3);
    //    }else if (sayi2>sayi3 && sayi3>sayi1){
    //        System.out.println("Minimum sayi: "+ sayi1);
    //    }else if (sayi3>sayi2 && sayi2>sayi1){
    //        System.out.println("Minimum sayi: "+ sayi1);
    //    }else if (sayi3>sayi1 && sayi1>sayi2){
    //        System.out.println("Minimum sayi: "+ sayi2);
    //    }
//
    //}
//
    //// *** Task08 ***
    //public static void main(String[] args) {
//
    //    /*
    //    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    //    olmadığını kontrol eden method create ediniz
//
    //    Test Data:
    //    2017
//
    //    Beklenen Çıktı:
    //    false
    //    */
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Bir yil girin: ");
    //    int yil= sc.nextInt();
//
    //    artikYil(yil);
//
    //}
//
    //private static void artikYil(int yil) {
//
    //    if (yil%4==0){
    //        System.out.println(yil+" yili Artik Yildir");
    //    }else{
    //        System.out.println(yil+" yili Artik Yil Degildir");
    //    }
//
    //}
//
    //// *** Task09 ***
    //public static void main(String[] args) {
//
    //    /*
    //    Saati saniyeye çeviren  method create ediniz
//
    //    Test Data:
    //    howManySeconds(2);
    //    Beklenen çıktı:
    //     7200
    //    */
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Saati girin: ");
    //    int saat= sc.nextInt();
//
    //    howManySeconds(saat);
//
//
    //}
//
    //private static void howManySeconds(int saat) {
//
    //    int saniye= saat*3600;
    //    System.out.println(saat+" saat "+saniye+" saniyedir");
    //}
//
    //// *** Task11 ***
    //public static void main(String[] args) {
//
    //     /*
    //     Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
//
    //     Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    //     s -> 5
    //     a -> 4
    //     e -> 3
    //     i -> 1
    //     o -> 0
//
    //     Test data
    //     hackerDili("javayı severim")
    //     j4v4yı 53v3r1m
//
    //     İpucu harfleri değiştirin ve ekrana yazdırın.
    //     */
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Bir metin girin: ");
    //    String metin = sc.nextLine().toLowerCase();
//
    //    hackerDili(metin);
//
    //    System.out.println(hackerDili(metin));
//
    //}
//
    //public static String hackerDili(String metin) {
//
    //    metin= metin.replace("s","5");
    //    metin= metin.replace("a","4");
    //    metin= metin.replace("e","3");
    //    metin= metin.replace("i","1");
    //    metin= metin.replace("o","0");
//
//
//
    //    return metin;
    //}
//
    //// *** Task12 ***
    //public static void main(String[] args) {
//
    //    /*
    //    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz
    //    Şartlar:
    //    * Bir mail adresinde @ karakteri olmalı
    //    * Bir mail adresinde . (nokta) karakteri olmalı
    //    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)
//
    //    Örnekler
    //    validateEmail("@gmail.com")
    //    Çıktı : false
//
    //    validateEmail("gmail")
    //    Çıktı : false
//
    //    validateEmail("hello@gmail")
    //    Çıktı : false
//
    //    validateEmail("hello@edabit.com")
    //    Çıktı : true
    //    */
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Lutfen mail adresinizi girin: ");
    //    String mail = sc.nextLine();
//
//
    //    mailKontrol(mail);
//
    //}
//
    //public static void mailKontrol(String mail) {
//
    //    if (mail.contains("@") && mail.indexOf("@") < mail.indexOf(".") && mail.indexOf(mail.charAt(0)) < mail.indexOf("@")  ){
    //        System.out.println("Girilen mail adresi gecerli");
    //    }else {
    //        System.out.println("Gecerli bir mail adresi girin");
    //    }
//
    //}
//
    //// *** Task13 ***
    //public static void main(String[] args) {
//
    ///*46----
    //Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz
//
    //Örnekler:
    //kontrolEt("abc", "bc") ➞ true
    //kontrolEt("abc", "d") ➞ false
    //kontrolEt("samurai", "zi") ➞ false
    //kontrolEt("feminine", "nine") ➞ true
    //kontrolEt("convention", "tio") ➞ false
    //*/
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Lutfen birinci kelimeyi girin: ");
    //    String kelime1 = sc.nextLine();
    //    System.out.print("Lutfen ikinci kelimeyi girin: ");
    //    String kelime2 = sc.nextLine();
//
    //    kontrolEt(kelime1,kelime2);
    //}
//
    //public static void kontrolEt(String kelime1, String kelime2) {
    //    System.out.println(kelime1.endsWith(kelime2));
//
    //}
//
    //// *** Task14 ***
    //public static void main(String[] args) {
//
    //    /*
    //    Fazla mesaiyi hesaplayan bir  method create ediniz
    //    Yazacağınız program toplam kazancı return etsin.
//
    //    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    //    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.
//
    //    Daha sonra şu şekilde bir program yazınız :
//
    //    Örnek :
    //    saatlik çalışma ücreti : 40.0
    //    hangi saat başladı : 9.0
    //    hangi saat bitti : 20.0
    //    mesaiyi kaçla katlayacağız : 1.8
//
    //    ucretHesapla(9.0,20.0,40.0,1.8);
//
    //    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    //    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216
//
    //    toplam = 536.0
    //    */
//
    //    Scanner sc= new Scanner(System.in);
    //    System.out.print("Lutfen mesaiye saat kacta basladiginizi girin: ");
    //    double baslangicSaati = sc.nextDouble();
    //    System.out.print("Lutfen mesainin saat kacta bittigini girin: ");
    //    double bitisSaati = sc.nextDouble();
    //    System.out.print("Lutfen saatlik calisma ucretini girin: ");
    //    double saatUcreti = sc.nextDouble();
    //    System.out.print("Fazla mesaiye kalırsaniz kazancınızın kaç ile katlanacagini girin: ");
    //    double fazlaMesaiKatsayi = sc.nextDouble();
//
    //    double ucret= ucretHesapla(baslangicSaati,bitisSaati,saatUcreti,fazlaMesaiKatsayi);
    //    System.out.println(ucret);
//
    //}
//
    //public static double ucretHesapla(double baslangicSaati, double bitisSaati, double saatUcreti, double fazlaMesaiKatsayi) {
//
    //    double toplam=0;
//
    //    if (bitisSaati>baslangicSaati && bitisSaati<24){
    //        if (bitisSaati<=17){
    //            toplam=(bitisSaati-baslangicSaati)*saatUcreti;
    //        } else{
    //            toplam=((17-baslangicSaati)*saatUcreti)+((bitisSaati-17)*saatUcreti*fazlaMesaiKatsayi);
    //        }
    //    }else {
    //        System.out.println("Gecerli saat araligi girin");
    //    }
    //    return toplam;
    //}




}
