package src.j18_Constructor.Tasks.Bisiklet;

import java.util.Scanner;

public class Bisiklet {

    int hiz;
    int vites;

    public Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    public void islemYap (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Islem Menusu:\n" +
                "1 -> Vites Artir\n" +
                "2 -> Vites Azalt\n" +
                "3 -> Hiz Degistir\n" +
                "4 -> Durum Goster\n" +
                "5 -> Cikis");
        int secim =sc.nextInt();

        switch (secim){
            case 1: vitesArtir();islemYap();
            case 2: vitesAzalt();islemYap();
            case 3: hizDegistir(120);islemYap();
            case 4:durumGoster();islemYap();
            case 5:
                System.out.println("Cikisiniz Gerceklestirilmistir.");
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz. Tekrar Deneyin");
                islemYap();
        }


    }

    public void hizDegistir (int yeniHiz){

        hiz=yeniHiz;
        System.out.println("Yeni Hiziniz: "+hiz);

    }

    public void vitesArtir(){
        vites++;
        if (vites>5){
            System.out.println("Enfazla 5. vitese cikabilirsiniz");
            vites--;
        }
        System.out.println("Suanki vitesiniz: "+vites+"\n");
    }

    public void vitesAzalt(){
        vites--;
        if (vites<1){
            System.out.println("Enaz 1. vitese dusebilirsiniz");
            vites++;
        }
        System.out.println("Suanki vitesiniz: "+vites+"\n");
    }

    public void durumGoster(){
        System.out.println("Suanki vitesiniz: "+vites);
        System.out.println("Suanki hiziniz: "+hiz+"\n");

    }
}
