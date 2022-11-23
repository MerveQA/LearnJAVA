package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\nHaftanın kaçıncı gününde olduğunu giriniz : ");
        int kacinciGun = scan.nextInt();



        if (kacinciGun>0 && kacinciGun<8){
            int hedefGun = (100+kacinciGun)%7;
            System.out.println(hedefGun);

            switch (hedefGun) {
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
                case 0:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("Yanlis isim girdiniz");
            }
        }else{
            System.out.println("Gecerli bir gun numarasi girin");
        }










    }
}

