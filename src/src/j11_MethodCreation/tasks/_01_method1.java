package src.j11_MethodCreation.tasks;


import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("Random bir sayi elde etmek max degeri girin: ");
        int max= sc.nextInt();

        System.out.println("Girilen max deger: "+max);
        int randomSayi= randomNum(max);
        System.out.println("randomSayi = " + randomSayi);
    }

    public static int randomNum(int a) {
        int randomNum = (int)(Math.random() * a);

        return randomNum;
    }
}

