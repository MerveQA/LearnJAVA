package src.j08_IfStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

        // *** _01_if_statement *** //

         /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        int a= 35;
        int b= 23;

        if (a>b){
            System.out.println("int 1 is greater than 2");
        }
        if (a<b){
            System.out.println("int 1 is smaller than 2");
        }


        // *** _02_if_statement2 *** //

        /*İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
          Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
          Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın. */

        //Kodu aşağıya yazınız.
        int x= 26;
        int y= 35;
        if (x>y){
            System.out.println("int 1 is greater than 2");
        }
        if (x<y){
            System.out.println("int 1 is smaller than 2");
        }


        // *** _01_if_statement *** //

        /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        String str1= "Java Candir";
        String str2= "Java Candir";

        if (str1==str2){
            System.out.println("String 1 is equal to String 2");
        }else{
            System.out.println("String 1 is NOT equal to String 2");
        }


        // *** _04_if_else_if_statement4 *** //

         /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
        double d1= 45.35;
        double d2= 23.58;

        if (d1>d2){
            System.out.println("double 1 is greater than double 2");
        }else {
            System.out.println("double 1 is smaller than double 2");
        }


        // *** _05_if_else_if_statement5 *** //

        /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */
        double db1= 90.25;
        double db2= 90.25;

        if (db1>db2){
            System.out.println("Hello World");
        } else if (db1<db2) {
            System.out.println("Not Hello World");
        }else {
            System.out.println("I love java");
        }


        // *** _06_if_else_if_statement6 *** //

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (number==0){
            System.out.println("Im neutral");
        }else if (number>0){
            System.out.println("I m positive");
        }else {
            System.out.println("I am negative");
        }


        // *** _07_if_else_if_statement7 *** //

        /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        System.out.print("Sayi giriniz: ");
        int number1 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (number1%2==0){
            System.out.println("number is a EVEN number");
        }else {
            System.out.println("number is a ODD number");
        }


        // *** _08_if_else_if_statement8 *** //

        /*  33 değerinde bir int oluşturun.
            Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
            Aksi halde (else) "Reminder is 0" yazdırınız.  */
        int deger= 33;

        if (deger%4==3){
            System.out.println("Remainder is 3");
        } else if (deger%4==2) {
            System.out.println("Remainder is 2");
        } else if (deger%4==1) {
            System.out.println("Remainder is 1");
        }else {
            System.out.println("Reminder is 0");
        }


        // *** _10_if_else_if_statement_with_logic_operators2 *** //

        /* 60 değerinde bir int oluşturun.
        Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        Eğer int 4'e bölününce kalan 0 ise ve 15'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        */
        int h=60;

        if (h%9==0 && h%5==0){
            System.out.println("Able to divide by 9 and 5");
        } else if (h%4==0 && h%15==0) {
            System.out.println("Able to divide by 4 and 15");
        }


        // *** _16_if_else_statement_with_logic_operators5 *** //

        /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.  */
        double s1= 45;

        if (s1%5==0 && s1%8==0){
            System.out.println("able to divide by 5 and 8");
        } else if (s1%10==5 && s1%9==0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }


        // *** _17_if_else_if_statement_find_max *** //

        /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        System.out.println("Aralarda enter tusuna basarak 3 sayi giriniz");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (i1>i2 && i2>i3){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i1>i3 && i3>i2){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i2>i1 && i1>i3){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i2>i3 && i3>i1){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i3>i2 && i2>i1){
            System.out.println("Maksimum sayi: "+ i3);
        }else if (i3>i1 && i1>i2){
            System.out.println("Maksimum sayi: "+ i3);
        }


        // *** _18_if_else_statement_find_min *** //

        /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */
        System.out.println("Aralarda enter tusuna basarak 3 sayi giriniz");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (m1>m2 && m2>m3){
            System.out.println("Minimum sayi: "+ m3);
        } else if (m1>m3 && m3>m2){
            System.out.println("Minimum sayi: "+ m2);
        } else if (m2>m1 && m1>m3){
            System.out.println("Minimum sayi: "+ m3);
        }else if (m2>m3 && m3>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m2 && m2>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m1 && m1>m2){
            System.out.println("Minimum sayi: "+ m2);
        }


        // *** _20_ticket_price *** //

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:  Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:  Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:  Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:  Ceza 500 $'dır.

        ve ayrıca, Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------
        Örn;

        currentSpeed(Hızınız) 87
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

        sonuç 320 olmalıdır.

        currentSpeed(Hızınız) 65
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

        sonuç 300 olmalıdır.  */

        System.out.print("Hizinizi giriniz: ");
        int currentSpeed = scan.nextInt();
        System.out.println("Ehliyeti var mı? true or false");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (currentSpeed<55 && isDriverLicenceAvailable==false){
            System.out.println("Hiziniz: "+currentSpeed+"km ehliyetsiz arac kullanmaktan cezaniz 200$`dir");
        } else if (currentSpeed<55 && isDriverLicenceAvailable==true) {
            System.out.println("Hiziniz: "+currentSpeed+"km herhangi bir ceza yok");
        }else if (currentSpeed>=55 && currentSpeed<75 && isDriverLicenceAvailable==false) {
            System.out.println("Hiziniz: "+currentSpeed+"km\nHiz sinirini asmaktan 100$\n" +
                    "Ehliyetsiz arac kullanmaktan 200$\nToplam cezaniz: 300$");
        }else if (currentSpeed>=55 && currentSpeed<75 && isDriverLicenceAvailable==true) {
            System.out.println("Hiziniz: "+currentSpeed+"km\nHiz sinirini asmaktan 100$ cezalisiniz");
        }else if (currentSpeed>=75 && currentSpeed<85 && isDriverLicenceAvailable==false) {
            System.out.println("Hiziniz: "+currentSpeed+"km\nHiz sinirini asmaktan 150$\n" +
                    "Ehliyetsiz arac kullanmaktan 200$\nToplam cezaniz: 350$");
        }else if (currentSpeed>=75 && currentSpeed<85 && isDriverLicenceAvailable==true) {
            System.out.println("Hiziniz: " + currentSpeed + "km\nHiz sinirini asmaktan 150$ cezalisiniz");
        }else if (currentSpeed>=85 && currentSpeed<95 && isDriverLicenceAvailable==false) {
            System.out.println("Hiziniz: "+currentSpeed+"km\nHiz sinirini asmaktan 320$\n" +
                    "Ehliyetsiz arac kullanmaktan 200$\nToplam cezaniz: 520$");
        }else if (currentSpeed>=85 && currentSpeed<95 && isDriverLicenceAvailable==true) {
            System.out.println("Hiziniz: " + currentSpeed + "km\nHiz sinirini asmaktan 320$ cezalisiniz");
        }else if (currentSpeed>=95 && isDriverLicenceAvailable==false) {
            System.out.println("Hiziniz: "+currentSpeed+"km\nHiz sinirini asmaktan 500$\n" +
                    "Ehliyetsiz arac kullanmaktan 200$\nToplam cezaniz: 700$");
        }else if (currentSpeed>=95 && isDriverLicenceAvailable==true) {
            System.out.println("Hiziniz: " + currentSpeed + "km\nHiz sinirini asmaktan 500$ cezalisiniz");
        }



    }
}
