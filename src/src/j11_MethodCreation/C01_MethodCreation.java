package src.j11_MethodCreation;

public class C01_MethodCreation {
    /*
       code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
          parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT) girilmeli.
       */
    public static void main(String[] args) { // main method acilisi

        System.out.println("Javacanlara selam");

        topla(); // parametresiz return type olmayan void bir method call edildi
        System.out.println("bu yaziyi okuduysan yukaridaki topla() methodu call oldu");

        topla2(34,43);
        System.out.println("agaya selam");

        int maas= topla3();
        System.out.println("maas = " + maas); // 135

        System.out.println("topla3() = " + topla3()); //135

        System.out.println(topla4(35, 48));// 166
        System.out.println(topla4(10, 20));// 60
        System.out.println(topla4(5, 8));// 26

        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
        //Method parantezinin icinde olusturulan variable'lara "parametre" denir.
        //Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
        //Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli


    } // main method kapanisi

    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
    // Best practice-> method'lar main method'dan sonra create edilir.

    public static int topla4(int b, int a) {//int ve int parametreli inr return eden method

        return 2*(a+b);
    }

    public static int topla3() { // parmetresiz int return type method
        int a=72;
        int b=63;

        return a+b;
    }

    public static void topla (){ // parametresiz return type`i olmayan void bir method
        int a= 33;
        int b= 23;

        System.out.println(a+b);
        System.out.println("topla() methodundan selamlar");
    }

    public static void topla2 (int a, int b){ // parametreli (2 int) void method
        System.out.println("bu topla2 (int a, int b) methodu parametreli");
        System.out.println("topla2 methodu: "+(a+b));
        System.out.println("topla2 (int a, int b) methodu bitti");
    }



}// class kapanis
