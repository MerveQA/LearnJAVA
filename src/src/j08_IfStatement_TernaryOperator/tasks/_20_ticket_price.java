package src.j08_IfStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

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

        Scanner scan = new Scanner(System.in);
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


