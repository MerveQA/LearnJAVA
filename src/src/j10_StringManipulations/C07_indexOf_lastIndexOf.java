package src.j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {

        /*
        indexOf()
        char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
        Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
        contains den farkı indexini verir, contains ise true false
        */

        String str="Good";
        System.out.println("str.indexOf('o') = " + str.indexOf('o')); // 1
        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o")); // 1
        System.out.println("str.indexOf(\"d\") = " + str.indexOf("d")); // 3
        System.out.println("str.indexOf(\"D\") = " + str.indexOf("D")); // -1

        // TRICK: olmayan karakter indexi sorgulanirsa -1 return eder.

        System.out.println("str.indexOf(\"od\") = " + str.indexOf("od")); // 2

        /*
         lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String name= "mustafa nizamoglu";
        System.out.println(name.indexOf('a')); // 4
        System.out.println(name.lastIndexOf('a')); // 11
        System.out.println(name.lastIndexOf("fa")); // 5

        /*
        task
         Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

         1-Girilen cumle java icermiyor
         2-Girilen cumle 1 tane java iceriyor
         3-Girilen cumlede birden fazla java var
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("cumle girin: ");
        String cumle= scan.nextLine().toLowerCase();

        if (cumle.indexOf("java")==-1){
            System.out.println("Girilen cumle java icermiyor");
        } else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else {
            System.out.println("Girilen cumlede birden fazla java var");
        }


    }
}
