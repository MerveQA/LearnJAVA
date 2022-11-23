package src.j11_MethodCreation;

import java.util.Scanner;

public class C04_MethodCreation { // Traktor

    public static void main(String[] args) {

        String name="Haluk";
        System.out.println("Isim: "+name);


        C04_MethodDepo.gecmeNotu(24); // MethodDepo Class`tan name ile method call ettik

        Scanner sc= new Scanner(System.in);
        System.out.print("Notunuzu girin: ");
        int not= sc.nextInt();

        C04_MethodDepo.gecmeNotu(not);


        C04_MethodDepo.topla(3,5); // 8

        /*
        Farkli class`tan metod call etmek icin...
        1. method static -> gokteki gunes gibi
        2. ClassName.methodName() seklinde call edilir.
        ayni class`daki method dogrudan mathodName ile call edilir..
         */

        selamVer();// ayni class`dan methodName ile call edildi.


    }

    public static void selamVer(){

        System.out.println("Selamlar Dewamkeee");
    }



}
