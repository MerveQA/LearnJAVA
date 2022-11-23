package src.j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {

        /*
        Recursive call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
        fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
        Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
        Peki özyinelemeyi neden kullanıyoruz?
        Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
        */
    public static void main(String[] args) {

        //Faktoriyel girilen sayidan 1`e kadar olan tamsayilarin carpimina denir.

        //Girilen sayinin faktoriyelini hesaplayan method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz: ");
        int sayi=sc.nextInt();

        System.out.println(faktoriyel(sayi));

    }
    public static int faktoriyel(int a) {

        if (a >= 1) {
            return a*faktoriyel(a-1);
        } else{
            return 1;
        }


    }
}
