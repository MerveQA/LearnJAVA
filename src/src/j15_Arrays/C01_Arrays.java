package src.j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konulan max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */

        // Array tanimlama ...
        int a; // declare edilen ama atanamayan primitive data
        int arr[];// declare(tanimlanan) edilen ama atanamayan int type array

        String isimArr [] ={"muharrem", "enise", "cebrail", "nazim", "ozge"};// hem tanimlama hem atama yapilan String Array
        String [] isimArr1 ={"muharrem", "enise", "cebrail", "nazim", "ozge"};// hem tanimlama hem atama yapilan String Array

        int sayiArr [] = new int[5]; // java heap memory`de default -> 0 olan int array create edildi.


        //Arra`ye eleman ekleme...
        sayiArr[2]=34;
        sayiArr[0]=35;
        sayiArr[1]=34;
        sayiArr[3]=61;

        sayiArr[0]=34;// 0 index array elemani update edildi.
        // array elemanlari unique olmak zorunda degildir tekrarli olabilir

        //Array eleman sayisi boyut degeri
        System.out.println("sayiArr.length = " + sayiArr.length); // 5

        // Array son elemani
        System.out.println("isimArr.length-1 = " + isimArr[isimArr.length - 1]); // ozge
        isimArr[isimArr.length-1]="Qa Ozge"; // array son eleman update edildi.

        // Array de olmayan eleman
        // TRICK: sayiArr[11]=23; // CTE vermez ama olmayan eleman RTE verir. -> array run time`da olusur

        // Array elemanlari prin etme
        for (int i = 0; i < isimArr1.length; i++) {
            System.out.print(isimArr[i]+" ");
        }

        System.out.println("\n"+isimArr); //[Ljava.lang.String;@4cb2c100 -> isimArr`nin referans degeridir
        System.out.println("isimArr= " + Arrays.toString(isimArr)); // isim Arr sitringe cevrildi
                                                                    //[muharrem, enise, cebrail, nazim, Qa Ozge]


        //TASK: sayiArr`deki tek sayilari yazdiran code create ediniz.

        for (int i = 0; i < sayiArr.length; i++) {

            if (sayiArr[i]%2!=0){
                System.out.print(sayiArr[i]+" "); // 61
            }
        }

        //TASK: sayiArr`deki cift index elemanlari yazdiran code create ediniz.

        for (int i = 0; i < sayiArr.length; i+=2) {

                System.out.print(sayiArr[i]+" "); // 34 34
        }

        //TASK:  isimArr`deki bes harfli elemanlarindan olusan arrayin elemanlarini prin ediniz

        int koltukSayisi = 0;
        //isimArr elemanı kadar boş yeni arr
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() == 5) {
                koltukSayisi++;//
            }
        }

        String yeniArr[] = new String[koltukSayisi];

        for (int i = 0; i < isimArr.length; i++) {

            for (int j = 0; j < yeniArr.length; j++) {

                if (isimArr[i].length() == 5) {
                    yeniArr[j] = isimArr[i];
                }
            }
        }
        System.out.println(koltukSayisi);//2
        System.out.println(Arrays.toString(yeniArr));//

        //Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama için sort(); method kulanılır
        System.out.println(Arrays.toString(isimArr));//sıarlama öncesi-> [muharrem, enise, cebrail, nazım, QA Özge hanım]
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr));//sıralama sonrası -> [QA Özge hanım, cebrail, enise, muharrem, nazım]

        System.out.println(Arrays.toString(sayiArr)); // siralama oncesi [34, 34, 34, 61, 0]
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr)); // siralama sonrasi [0, 34, 34, 34, 61]

    }


}
