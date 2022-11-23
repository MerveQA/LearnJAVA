package src.j10_StringManipulations;

import java.util.Scanner;

public class C05_StartEndWith {
    public static void main(String[] args) {

        /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String sehir= "istanbul";

        System.out.println(sehir.startsWith("i")); // true
        System.out.println(sehir.startsWith("is")); // true
        System.out.println(sehir.startsWith("s")); // false
        System.out.println(sehir.startsWith("a", 3)); //true -> 3. indexten itibaren String a ile mi baslar

        System.out.println(sehir.endsWith("l")); // true
        System.out.println(sehir.endsWith("bul")); // true
        System.out.println(sehir.endsWith("bu")); // false

        String str= "bul";
        System.out.println(sehir.endsWith(str)); // true
        int yas=48;
        // System.out.println(sehir.endsWith(yas)); // CTE verir

        /*
        TASK: Girilen e-mail hesabini @gmail.com icemiyorsa "lutfen gmail hesabi giriniz".
              @gmail.com  ile bitiyorsa "onylandi" aksi durumda "gecerli hesap giriniz"
              print eden code create ediniz
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("e-mail hesabinizi girin: ");
        String mail= scan.nextLine().toLowerCase();

        if (mail.contains("@gmail.com")){ // icerip icermemesi kontol edildi
            if (mail.endsWith("@gmail.com")){ // "@gmail.com" e-mail hesabinin sonunda yer alip almamasi kontrol edildi
                System.out.println("Hesabiniz onaylandi");
            }else {
                System.out.println("gecerli hesap giriniz");
            }
        }else {
            System.out.println("lutfen gmail hesabi giriniz");
        }


    }
}
