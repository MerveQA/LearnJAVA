package src.j18_Constructor.Tasks.Bisiklet.Team10;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);
    BisikletClass b01 = new BisikletClass(100, 2);


    public void bisikletmenu() {


        System.out.println(" Hangi islemi secmek istersiniz\n1-hizDegistir" +
                "\n2-vitesArtir\n3-vitesAzalt\n4-durumgoster\n5-cikis");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                b01.hizdegistir(200);
                bisikletmenu();
            case 2:
                b01.vitesArtir();
                bisikletmenu();
            case 3:
                b01.vitesAzalt();
                bisikletmenu();
            case 4:
                b01.durumGoster();
                bisikletmenu();
            case 5:
                System.out.println("iyi gunler");
                break;
            default:
                System.out.println("hatali giris");
                bisikletmenu();
        }


    }

}
