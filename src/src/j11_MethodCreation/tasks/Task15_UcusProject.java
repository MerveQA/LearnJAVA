package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task15_UcusProject {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
    */

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Gitmek istediginiz sehri seciniz" +
                           "\nB sehri icin -> B" +
                           "\nC sehri icin -> C" +
                           "\nD sehri icin -> D" +
                           "\n    Tuslayiniz: ");
        String rota= scan.next().toUpperCase();

        System.out.print("Ucus yonu icin" +
                       "\n Tek yon icin -> 1" +
                       "\nCift Yon icin -> 2" +
                       "\n      Tuslayiniz: ");
        int ucusYonu= scan.nextInt();

        System.out.print("Yasinizi Giriniz: ");
        int yas= scan.nextInt();

        double fiyatB=500*0.10; // A`dan B`ye ucus fiyati
        double fiyatC=700*0.10; // A`dan C`ye ucus fiyati
        double fiyatD=900*0.10; // A`dan D`ye ucus fiyati

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")){
            if (yas>=65){ //yas kontrolu
                if (rota.equals("B")){ // rota B
                    if (ucusYonu==1){ // tek yon
                        System.out.println("65 yas ustu B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB*0.7)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("65 yas ustu B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB*0.7*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("C")) { // Rota C
                    if (ucusYonu==1){ // tek yon
                        System.out.println("65 yas ustu C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC*0.7)+"$");

                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("65 yas ustu C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC*0.7*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("D")) { // rota D
                    if (ucusYonu==1){ // tek yon
                        System.out.println("65 yas ustu D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD*0.7)+"$");

                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("65 yas ustu D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD*0.7*0.8)*2+"$");

                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                }else{
                    System.out.println("Hatali Rota Secimi");
                }
            } else if (yas<=24 && yas>=12) { // Yas Kontrol
                if (rota.equals("B")){ // rota B
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12-24 yas arasi B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB*0.9)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12-24 yas arasi B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB*0.9*0.8)*2+"$");

                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("C")) { // Rota C
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12-24 yas arasi C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC*0.9)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12-24 yas arasi C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC*0.9*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("D")) { // rota D
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12-24 yas arasi D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD*0.9)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12-24 yas arasi D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD*0.9*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                }else{
                    System.out.println("Hatali Rota Secimi");
                }
            }else if (yas<12){ // Yas Kontrol
                if (rota.equals("B")){ // rota B
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12 yas alti B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB*0.5)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12 yas alti B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB*0.5*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("C")) { // Rota C
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12 yas alti C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC*0.5)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12 yas alti C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC*0.5*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("D")) { // rota D
                    if (ucusYonu==1){ // tek yon
                        System.out.println("12 yas alti D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD*0.5)+"$");

                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("12 yas alti D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD*0.5*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                }else{
                    System.out.println("Hatali Rota Secimi");
                }
            }else { //24-65 yas arasi indirim alamayan
                System.out.println("Yas indirimi alamadiniz");
                if (rota.equals("B")){ // rota B
                    if (ucusYonu==1){ // tek yon
                        System.out.println("24-65 yas arasi B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("24-65 yas arasi B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("C")) { // Rota C
                    if (ucusYonu==1){ // tek yon
                        System.out.println("24-65 yas arasi C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC)+"$");
                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("24-65 yas arasi C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                } else if (rota.equals("D")) { // rota D
                    if (ucusYonu==1){ // tek yon
                        System.out.println("24-65 yas arasi D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD)+"$");

                    } else if (ucusYonu==2) { // cift yon
                        System.out.println("24-65 yas arasi D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD*0.8)*2+"$");
                    }else {
                        System.out.println("Hatali Giris Yaptiniz");
                    }
                }else{
                    System.out.println("Hatali Rota Secimi");
                }
            }
        }else{
            System.out.println("Hatali Giris Yaptiniz.");
        }




    }
}
