package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {

        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        String girilenDeger =scan.next();

        System.out.println("Kullanicinin Girdigi Deger: "+girilenDeger);

        String deger[] = girilenDeger.split("");

        System.out.println("Kullanicinin Girdigi Degerin Array`e cevrilmis hali: "+ Arrays.toString(deger));
        String tersten="";

        for (int i = deger.length-1; i >0 ; i--) {
            tersten+=deger[i];
        }
        System.out.println("Degerin Terten yazdirilmis hali: "+tersten);











    }
  
}
