package src.j13_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {

        /*
        break blogu istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
        kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
        herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
        loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
        satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
        içinde kullanıldığı loop'dan çıkışı sağlar:

        temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
        */

        // Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("mail adresi girin: ");
        String mail=sc.nextLine();

        for (int i = 0; i < mail.length(); i++) { // 0 indexten mail son indexe kadar herbir karakteri donguye alir

            char ch= mail.charAt(i); // dongudeki herbir karakteri ch`ye atar

            if (ch=='@') { // ch`de @ isareti varsa if blok run olur
                break; // if blok loopu sonlandirir kirar.
            }
            System.out.print(ch);

        }

        System.out.println("\nsubstring: "+(mail.substring(0,mail.indexOf("@"))));



    }

}
