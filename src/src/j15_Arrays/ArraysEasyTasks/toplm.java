package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class toplm {
    public static void main(String[] args) {


         /*  _01_Create_array
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) crdeate edip print eden code create ediniz.
         */
        //Kodu aşağıya yazınız.

        String str []={"Apple", "Orange", "Banana", "Kiwi"};

        System.out.println(Arrays.toString(str));



        /* _02_Create_array2
             int Array oluşturun.
             elemanları : 13, 15,14,16,16
             Arrayin elemanlarını yazdırın.
        */
        // Kodu aşağıya yazınız..

        int sayiArr[]={13, 15, 14, 16, 16};

        System.out.println("Arrays.toString: "+Arrays.toString(sayiArr));

        // String str=Arrays.toString(sayiArr);

        //System.out.println("str = " + str);
        //System.out.println("str.length() = " + str.length());

        for (int i = 0; i < sayiArr.length; i++) {

            System.out.print(sayiArr[i] + " ");

        }



        /* _03_Create_array3_int
          elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
         */

        int arr[]=new int[5];

        arr[0]=25;
        arr[1]=30;
        arr[2]=30;
        arr[3]=35;
        arr[4]=100;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        System.out.println("toplam = " + toplam);
        System.out.println("farkli bir yol: "+(arr[0]+arr[1]+arr[2]+ arr[3]+arr[4])); // farkli bir yol: 220
        System.out.println("farkli bir yol: "+arr[0]+arr[1]+arr[2]+ arr[3]+arr[4]); // farkli bir yol: 25303035100


         /* _04_Create_Array_String

        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        String arr1[]={"new jersey", "new york", "boston","California"};

        System.out.println("Array'daki eleman sayısı = " + arr1.length);


         /* _05_Array_with_for_if

         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin: -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayiArr1[]={ 5,6,8,12,14,19};

        int toplm=0;

        for (int i = 0; i < sayiArr1.length; i++) {

            if (sayiArr1[i]%2==0){
                toplm+=sayiArr1[i]; // +6+8+12+14  =40
            }else {
                toplm-=sayiArr1[i]; // -5 -19 = -24
            }
        }
        // toplam -5 +6 +8 +12 +14 -19 =16
        System.out.println("toplam= " + toplam); // 16



         /* _06_Array_contains
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        String str1 []= {"Apple" , "Orange" , "Banana" , "Pineapple"};

        for (int i = 0; i < str1.length; i++) {

            if (str[i].equals("Apple")) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }
        }


            /*_07_array_max_value
        int Array oluşturun ve elemanları : 12,2,5,15,8
        En büyük değeri yazdırınız.
        */

            int array[]={12,2,5,15,8};

            int maxDeger= array[0];

            for (int i = 0; i < array.length; i++) {

                if (array[i]>maxDeger){
                    maxDeger=array[i];
                }
            }
            System.out.println("Max deger: "+maxDeger); // 15



         /* _08_array_min_value
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        int[] sayilar ={14 , 19 , 5 , 21};

        int minDeger= sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {

            if (minDeger>sayilar[i]){
                minDeger=sayilar[i];
            }
        }
        System.out.println("Minimum deger: "+minDeger); // 5



        /*_09_array_second_max
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int sayiArr2[]={15 , 25, 22, 18, 30};

        Arrays.sort(sayiArr2);
        System.out.println(sayiArr2[sayiArr2.length-2]); // 25



        /* _10_reverse_String
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str2="Hello World";

        String strArr[]=str2.split("");

        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]); //dlroW olleH
        }



        /* _12_Array_no14
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç true olmalı
         */

        int inArr[]={1,2,3,4};

        int sayac=0;
        for (int i = 0; i < inArr.length; i++) {

            if (inArr[i]==1 ) {
                sayac++;
            }
            if (inArr[i]==4){
                sayac++;
            }
        }
        System.out.println(sayac != 2);



      /* _13_Advance_zeroFront
        Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
        için yeniden düzenlenmiş bir Array döndürün.
        Sıfır olmayan sayıların sırası önemli değildir.
        Böylece {1, 0, 0, 1} gibi {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

        Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
        Sonuç böyle olmalı :  0,0,0,1,1
        */

        int sayilarr []= {1,0,0,1,0};

        System.out.println(Arrays.toString(sayilarr)); // [1, 0, 0, 1, 0]
        Arrays.sort(sayilarr);
        System.out.println(Arrays.toString(sayilarr)); // [0, 0, 0, 1, 1]



         /* _14_String_method_replace
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String strr="Hello World";

        System.out.println(strr.replace("o", "K")); //HellK WKrld



        /* _15_Word_Count
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        String cumle1="Removes white space from both ends of a string";

        String cumle1Arr []= cumle1.split(" ");

        System.out.println("cumledeki kelime sayisi: " + cumle1Arr.length); // 9



        /* _16_Advance_Array_get_sum
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String para="$12 $23 $10 $2 $5 $2";
        para=para.replaceAll("\\$","");

        String paraArr[]= para.split(" ");
        System.out.println(Arrays.toString(paraArr));

        int tplm=0;
        for (int i = 0; i < paraArr.length; i++) {
            tplm+=Integer.parseInt(paraArr[i]);
        }
        System.out.println("$"+tplm); // $54



        /* _17_2d_Array
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        int arr2d [][]={{2,3,2} , {4,1,5} , {7,2,5}};

        System.out.println("Degisiklik oncesi Array:  "+Arrays.deepToString(arr2d));
        for (int k = 0; k < arr2d.length; k++) {
            for (int d = 0; d < arr2d[k].length; d++) {

                if (arr2d[k][d]==2){
                    arr2d[k][d]=6;
                }
            }
        }
        System.out.println("Degisiklik sonrasi Array: "+Arrays.deepToString(arr2d)); // [[6, 3, 6], [4, 1, 5], [7, 6, 5]]



        /* _18_2d_array2
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        int arr3[][]={{5,2,1} , {10,2,3,6} , {1,2}};

        int arrToplam=0;

        for (int k = 0; k <arr3.length ; k++) {
            for (int d = 0; d < arr3[k].length; d++) {
                arrToplam+=arr3[k][d];
            }
        }
        System.out.println("Toplam: "+arrToplam); // 32



        /* _19_2d_Array_3
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String sehirArr[][]={{"new jersey","atlanta","ohio"}, // kat 0
                {"Pittsburgh" ,"ohio","new york","ohio"}, // kat 1
                {"ohio","new york"}}; // kat 2

        for (int k = 0; k < sehirArr.length; k++) {
            for (int d = 0; d < sehirArr[k].length; d++) {

                if (sehirArr[k][d].equalsIgnoreCase("ohio")){
                    sehirArr[k][d]="Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(sehirArr));
        //[[new jersey, atlanta, Florida], [Pittsburgh, Florida, new york, Florida], [Florida, new york]]



        /* _20_Arrayboth_Ends
        Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
        ilk ve son elementlerini kapsayan yeni array'e return edin.

        Oluşturacağınız int array'i =   ([1, 2, 3, 4])

        Sonuç bu şekilde olmalıdır. [1, 4]
        */

        int inputArr[]={1, 2, 3, 4};

        int yeniArr[]=new int[2];

        yeniArr[0]=inputArr[0]; // yeniArr`nin 0. indexine inputArr`nin 0. indexi atandi
        yeniArr[1]=inputArr[inputArr.length-1];//yeniArr`nin 1. indexine inputArr`nin son indexi atandi

        System.out.println(Arrays.toString(yeniArr)); // [1, 4]



        /* _21_Array_reverse
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
        */

        int input=123;

        String arrInput[]=String.valueOf(input).split("");

        int tersArr[]= new int [arrInput.length];
        int a=0;
        int index=0;

        for (int i = arrInput.length-1; i >=0 ; i--) {
            tersArr[index]=Integer.parseInt(arrInput[i]);
            index++;
        }
        System.out.println(tersArr[0]*100+tersArr[1]*10+tersArr[2]); // 321




    }
}
