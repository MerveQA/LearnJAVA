package src.j15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {

        /*
      Çok Boyutlu Diziler
    Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
    Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
    formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
    matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
    satır ve sütun sayısını girmemiz yeterli olacaktır.
    * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
    Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
            icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
            Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
            en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        // MdArray tanimlama...

        int arr1[][]=new int[3][5]; // 3 katli her katta 5 dairesi olan bos apt.

        //TRICK: Arrayi uzunluklari ile tanimlamak icin uzunluklari esit olmali................................

        // Bir sitede her birinde 10 dairelik 8 katli 6 apt. var. Nasil arry olarak tanimlanir.
        int site [][][]= new int[6][8][10];

        //24 kisilik 3 sinif ve 21 kisilik 5 sinifi olan okul nasil array olarak tanimlanir.
        int sinif24[][]=new int[3][24];
        int sinif21[][]=new int[5][21];


        // MdArray eleman ekleme...

        arr1[2][4]=35; // 2. kat 4. daire degeri 35 atandi
        arr1[0][3]=34; // 0. kat 3. daire degeri 34 atandi

        // Elemanlari girilerek Array tanimlama.
        int arr [][]={{1,2,3},{10,20},{101}};

        //MdArray elemanlar nasil print edilir.

        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
        //  toString methodu outer methodu Stringe cevirir
        // outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
        // referans degerlerini yazdirilir

        //MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.
        System.out.println(arr[1]); // [I@19dfb72a -> arr[1] bir array oldugu icin dogrudan sout komutu raferansini verir.
        System.out.println(Arrays.toString(arr[1])); // [10, 20]
        System.out.println(arr[1][0]); // 10

        System.out.println(Arrays.toString(arr)); // [[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [10, 20], [101]]


    }
}
