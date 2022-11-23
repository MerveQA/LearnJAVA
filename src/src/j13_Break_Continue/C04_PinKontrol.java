package src.j13_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {

        //TASK: String data type bir pin datasinin 3 giris hakkini kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);

        String pin="";

        String gecerliPin= "javaCAN";

        for (int i = 1; i <4 ; i++) {
            System.out.print("Pin kodunuzu girin: ");
            pin= sc.nextLine();
            if (pin.equals(gecerliPin)){
                System.out.println("Pin Kodunuz Gecerli");
                break;
            }else {
                System.out.println((3-i==0) ? ("Hatali Giris Yaptiniz. Kartiniz Bloke Oldu") :
                                              ("Hatali Giris Yaptiniz. Kalan Hakkiniz: "+(3-i)));
            }

        }



    }
}
