package src.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("bir sayi girin: ");
        int sayi= sc.nextInt();

        asalSayiMi(sayi);
    }

    private static void asalSayiMi(int sayi) {

        int adet=0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                adet++;
            }
        }

        if (adet==2){
            System.out.println(sayi+" sayisi asal sayidir.");
        }else {
            System.out.println(sayi+" sayisi asal sayi degildir.");
        }
    }
}
