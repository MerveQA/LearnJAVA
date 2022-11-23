package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
        Kullanicidan 100 uzerinden notunu isteyin.
        Not'u harf sistemine cevirip yazdirin.
        50’den kucukse "D",
        =50  <60 arasi "C",
        =60  <80 arasi "B",
        =80’nin uzerinde ise "A"
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("100 uzerinden notunuzu girin: ");
        int not = scan.nextInt();

       // if(not<0 || not>100){
       //     System.out.println("0 ile 100 arasinda bir not girin" );
       // }else if (not<50){ // 0-49 dahil
       //     System.out.println("D");
       // } else if (not<60) { //50- 59 dahil
       //     System.out.println("C");
       // } else if (not<80) { // 60-79 dahil
       //     System.out.println("B");
       // } else { // 80-100 dahil
       //     System.out.println("A");
       // }


        if (not<0 ){  // Negatif sayi girilme durumunu kontrol eder.
            System.out.println("agam negatif  not olmaz\nadam gibi bişeyler gir :(\ngelmiim oraya");
        }else if (not<50){             // 50'den kucuk 0 buyuk esıt not alma kontrolu
            System.out.println("D");   // 0  - 49 dahil
        }else if (not>=50 && not<60){  // 60'den kucuk 50 buyuk esıt not alma kontrolu
            System.out.println("C");   // 50 - 59 dahil
        }else if (not>=60 && not<80){  // 80'den kucuk 60 buyuk esıt not alma kontrolu
            System.out.println("B");   // 60 - 79 dahil
        }else if (not>=80 && not<=100){// 100'kucuk esıt ve 80 buyuk esıt not alma kontrolu
            System.out.println("A");   // 80 - 100 dahıl
        }else{                         // 100'den buyuk olmayı kontrol eder
            System.out.println("agam 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\ngelmiim oraya");
        }



    }
}
