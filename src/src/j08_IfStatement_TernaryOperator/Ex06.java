package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        /*
        Kullanicinin cinsiyeti kadin ise 60 yasindan buyuk ve prim gunu 6000`den fazla ise
        cinsiyeti erkek ise 65 yasindan buyuk ve prim gunu 7000`den fazla ise
         emeklililigini kontrol eden code create ediniz
         */

        Scanner sc= new Scanner(System.in);
        System.out.print("Cinsiyetinizi giriniz Kadin  ->(K), erkek ->(E): ");
        char cinsiyet= sc.next().toUpperCase().charAt(0);


        if (cinsiyet=='K'){
            System.out.print("Yasinizi giriniz: ");
            int yas= sc.nextInt();
            if (yas>=60 ){
                System.out.print("Prim gununuzu giriniz: ");
                int primGun= sc.nextInt();
                if (primGun>=6000){
                    System.out.println("Emekli olabilirsiniz");
                }else{
                    System.out.println("Emekliliginiz icin: "+ (6000-primGun)+ " gun yatirmaniz lazim");
                }
            }else{
                System.out.println("Emekli olamazsiniz, emekliliginize " +(60-yas)+ " yil daha var.");
            }
        }else if(cinsiyet=='E'){
            System.out.print("Yasinizi giriniz: ");
            int yas= sc.nextInt();
            if (yas>=65 ){
                System.out.print("Prim gununuzu giriniz: ");
                int primGun= sc.nextInt();
                if (primGun>=7000){
                    System.out.println("Emekli olabilirsiniz");
                }else{
                    System.out.println("Emekliliginiz icin: "+ (7000-primGun)+ " gun yatirmaniz lazim");
                }
            }else{
                System.out.println("Emekli olamazsiniz, emekliliginize " +(65-yas)+ " yil daha var.");
            }
        }else{
            System.out.println("Dogru cinsiyet girisi yapiniz");
        }

        
    }
}
