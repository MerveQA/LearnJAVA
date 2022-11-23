package src.j16_ArrayList.Tasks;

import java.util.*;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        Scanner sc=new Scanner(System.in);

        List<String> urunList=new ArrayList<>(List.of("Elma","Armut","Mandalina","Portakal","Cilek"));
        List<Integer> urunFiyat= new ArrayList<>(List.of(12,15,9,19,22));


        int tolamFiyat=0;
        int kg=0;
        int urun=0;

        while (true){
            System.out.print("Almak istediginiz urunlerden;\n" +
                    urunList.get(0)+" icin      -> 0\n"+
                    urunList.get(1)+" icin     -> 1\n" +
                    urunList.get(2)+" icin -> 2\n" +
                    urunList.get(3)+" icin  -> 3\n" +
                    urunList.get(4)+" icin     -> 4\n" +
                    "     Tuslayin: ");
            urun=sc.nextInt();

            System.out.println();//dummy
            System.out.print(urunList.get(urun)+" "+urunFiyat.get(urun)+"$,\nKac kg "+urunList.get(urun)+" alacaksiniz: ");
            kg=sc.nextInt();

            System.out.println();//dummy
            System.out.println(kg+" kg "+urunList.get(urun)+" aldiniz");

            System.out.println(); // dummy
            System.out.print("Baska bir urun almak istiyormusunuz?\nEvet ise  -> E\nHayir ise -> H\n  Tuslayin: ");
            char secim=sc.next().toUpperCase().charAt(0);

            if (secim == 'H') {
                tolamFiyat+=kg*urunFiyat.get(urun);
                System.out.println("Toplam borcunuz: "+tolamFiyat+"$");
                break;
            }else {
                tolamFiyat+=kg*urunFiyat.get(urun);
            }

        }




    }

}






