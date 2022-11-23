package src.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {

        //Task: Kullanicinin girdigi yilin ay sirasina gore ayin ismini prin eden kod creat ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Ay numarasi : ");
        int ay= scan.nextInt();


        switch (ay){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayis");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eylul");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasim");
                break;
            case 12 :
                System.out.println("Aralik");
                break;
            default:
                System.out.println("1 ile 12 arasinda bir sayi girin");
        }

    }
}
