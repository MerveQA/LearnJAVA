package src.j23_Varargs_StringBuilder.StringBuilder;

import java.time.Duration;
import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {

         /*
        String = > daha yavas ,Immutable==> degisemez,
        String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

        1) Java pass-by-value kullanir
        2) String Class'i immutable Class'dir.

         StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
         StringBuffer synchronized,thread safe.

        StringBuilders = mutable==>degisebilir ,
        not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

        1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
        StringBuilder isimli bir class uretmistir.
        2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
        "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
        "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
        Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
         */

        String str = "JavaCAN";
        System.out.println("method oncesi str: " + str); // JavaCAN
        strBirlestir(str); // JavaCAN agama selam
        System.out.println("method sonrasi str: " + str); // JavaCAN

        // TASK: 50000 tekrarli bir loop ile String ve StringBuilder obj run time surelerini karsilastiran method yazin

        String str1 = "";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1Basla = LocalTime.now();
        System.out.println("str1Basla = " + str1Basla);
        for (int i = 0; i < 50000; i++) {
            str1 += i;
        }
        LocalTime str1Bitis = LocalTime.now();
        System.out.println("str1Bitis = " + str1Bitis);
        System.out.println("Gecen Sure: "+Duration.between(str1Bitis, str1Basla)); // 0.844122


        LocalTime sb1Basla = LocalTime.now();
        System.out.println("sb1Basla = " + sb1Basla);
        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sb1Bitis = LocalTime.now();
        System.out.println("sb1Bitis = " + sb1Bitis);
        System.out.println("Gecen Sure: "+Duration.between(sb1Bitis, sb1Basla)); // 0.0049945

        System.out.println(0.844122-0.0049945); // 0.8391275


    }

    public static void strBirlestir(String str) {
        System.out.println(str + " agama selam");

    }
}
