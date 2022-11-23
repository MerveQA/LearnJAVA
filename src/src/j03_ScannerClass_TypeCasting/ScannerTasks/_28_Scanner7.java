package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*
         Bir boolean oluşturunuz.
         Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
         Varsa True , yoksa False olarak  konsoldan cevap veriniz.
         Boolean'ı yazdırınız.
         */

        Scanner scan= new Scanner(System.in);
        boolean varMi;
        System.out.println("Bir Banka Hesabınız Var mı ? \nVar ise true, yok ise false giriniz");
        varMi = scan.nextBoolean();

        System.out.println(varMi);



    }
}
