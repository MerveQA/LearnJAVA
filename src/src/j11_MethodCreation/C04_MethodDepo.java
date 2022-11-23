package src.j11_MethodCreation;

public class C04_MethodDepo { // Romork

    //main method olmayacak


    /*
    her class'da main method mecburiyeti yoktur.
    belilrli aksiyonlara özel class'lar tanımlanabilir..
     */

    public static void gecmeNotu(int not){

        if (not>=85){
            System.out.println("Basarili");
        } else if (not>=70) {
            System.out.println("Fena Degil");
        } else if (not>=60) {
            System.out.println("Iyi");
        } else if (not>=45) {
            System.out.println("Gecti");
        }else {
            System.out.println("Kaldi");
        }

    }

    public static void topla(int a,int b){

        System.out.println(a+b);
    }






}
