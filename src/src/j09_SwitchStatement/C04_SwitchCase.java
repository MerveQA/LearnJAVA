package src.j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Girilen ayin hangi mevsimde oldugunu print eden kod create ediniz

        Scanner scan=new Scanner(System.in);
       /* System.out.print("Ay numarasi : ");
        int ayNo= scan.nextInt();

        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Girilen ay kis mevsiminde");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Girilen ay ilkbahar mevsiminde");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Girilen ay yaz mevsiminde");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Girilen ay sonbahar mevsiminde");
                break;
            default:
                System.out.println("1 ile 12 arasinda bir sayi girin");
        }
*/
        System.out.print("Ay ismini girin : ");
        String ayIsmi= scan.nextLine().toLowerCase();

        switch (ayIsmi) {
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Girilen ay kis mevsiminde");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Girilen ay ilkbahar mevsiminde");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Girilen ay yaz mevsiminde");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Girilen ay sonbahar mevsiminde");
                break;
            default:
                System.out.println("1 ile 12 arasinda bir sayi girin");
        }
    }
}
