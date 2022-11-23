package src.j12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // loop-> dongu, tekrarlanan aksiyonlar icin kullanilan code bloklaridir.

        // TASK: 41 ker maasallah print ediniz
        System.out.println("Masallah");
        System.out.println("Masallah");
        System.out.println("Masallah");
        System.out.println("Masallah");
        System.out.println("Masallah");
        System.out.println("Masallah");
        System.out.println("Masallah");
        //          .
        //          .
        //          .


        //    baslangic    bitis   degisim
        for ( int i = 1 ; i <= 41 ; i++ ) {
            System.out.println(i + ". Masallah"); // 41 defa yazar.
        }

        System.out.println("Selam javacanlar"); // Dongu disi oldugu icin 1 kere yazdirir.

        //TASK: 2 basamakli tek sayilari yan yana yazdiriniz

        for (int i = 11; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        // Calismayan Loop
        for (int i = 0; i > 10; i++) { // sarti saglamayan for run olmaz. for kirilarak sonraki satirdan 36. satirdan devam eder
            System.out.println("Selam Javacan");
        }
        System.out.println("\nFordisi");

        // Durmayan Loop
        //for (int i = 0; i >=0 ; i++) { // sonsuz donguye girer
        //    System.out.println(i);
        //}


    }
}
