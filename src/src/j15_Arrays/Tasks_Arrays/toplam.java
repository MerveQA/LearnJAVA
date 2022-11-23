package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {

//        // **** Task03****
//        /*
//       Task-> Verilen  bir arrayin tum elemanlarini
//       bir soldaki konuma print eden code create ediniz
//       input:  [1,2, 3]
//        output [2, 3, 1]
//        */
//
//        int arr[]= {1,2,3};
//
//        int yeniArr[]=new int[arr.length];
//
//        for (int i = 1; i < arr.length; i++) { // burada ayni uzunlukta olusturulan yeni array`e tum elemanlar bir
//            yeniArr[i-1]=arr[i];			   // sola kaydirilarak eklendi. yeni arrayin son index elemani default deger almis oldu
//        }
//        yeniArr[arr.length-1]=arr[0]; // Burada input arrayin 0. index elemani yeni arrayin sonuncu sirasina eklendi
//
//        System.out.println("input Arr= "+ Arrays.toString(arr));
//        System.out.println("output Arr= "+Arrays.toString(yeniArr));
//
//
//
//
//        // **** Task05****
//        // Task-> girilen int değeri tersten print eden code create ediniz.
//
//        Scanner scan =new Scanner(System.in);
//        System.out.print("Bir sayi girin: ");
//        String girilenDeger =scan.next();
//
//        System.out.println("Kullanicinin Girdigi Deger: "+girilenDeger);
//
//        String deger[] = girilenDeger.split("");
//
//        System.out.println("Kullanicinin Girdigi Degerin Array`e cevrilmis hali: "+ Arrays.toString(deger));
//        String tersten="";
//
//        for (int i = deger.length-1; i >0 ; i--) {
//            tersten+=deger[i];
//        }
//        System.out.println("Degerin Terten yazdirilmis hali: "+tersten);
//
//
//
//
//        // **** Task06****
//         public static void main(String[] args) {
//
//            // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz
//
//            int arr[]= {3,5,6,1,9,45,25,4,9,0};
//
//            terstensirali(arr);
//        }
//
//        private static void terstensirali(int[] arr) {
//            Arrays.sort(arr);
//            System.out.println("Kucukten buyuge dogal sirali: "+Arrays.toString(arr));
//
//            int yeniArr[]=new int[arr.length];
//            for (int i = arr.length-1; i >0 ; i--) {
//                yeniArr[arr.length-1-i]=arr[i];
//            }
//
//            System.out.println("Tersten sirali: "+Arrays.toString(yeniArr));
//        }
//
//
//
//
//        // **** Task08****
//        //Task-> girilen 7 elemanlı bir int arrayın tek elemanlarını print eden code create ediniz.
//
//        int arr[]= {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i]%2!=0){
//                System.out.print(arr[i]+" ");
//            }
//        }
//        System.out.println(); //dummy
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i]%2==0){
//                System.out.print(arr[i]+" ");
//            }
//        }
//
//
//        // **** Task09****
//        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
//
//        Scanner sc =new Scanner(System.in);
//
//        int sayiArr[]= new  int[5];
//        int tersArr[]= new  int[sayiArr.length];
//
//        for (int i = 0; i < sayiArr.length; i++) {
//            System.out.print(i+". index sayisini giriniz: ");
//            sayiArr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(sayiArr));
//
//        for (int i = 0; i <tersArr.length ; i++) {
//            tersArr[i]=sayiArr[sayiArr.length-1-i];
//        }
//
//        System.out.println(Arrays.toString(tersArr));
//
//
//
//        // **** Task10****
//        public static void main(String[] args) {
//
//        /* TASK :
//        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
//        input : 1,2,-3,4,-5,-6
//        output :-1,-2,3,-4,5,6
//        */
//
//            int arr[] = {1, 2, -3, 4, -5, -6};
//            isDeg(arr);
//        }
//        private static void isDeg(int arr[]) {
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = arr[i] * (-1);
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//
//
//        // **** Task12****
//        /* TASK :
//        given an int array and find the squares of the elements
//        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
//        Example:{2,6,4,5,8,9}
//        output:{4,36,16,25,64,81}
//        */
//
//        int arr[] = {2, 6, 4, 5, 8, 9};
//
//        System.out.println("Verilen int Array: "+Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[i]*arr[i];
//
//        }
//
//        System.out.println("Verilen int Arrayin kareleri: "+Arrays.toString(arr));
//
//
//
//        // **** Task13****
//        /* TASK :
//         Kullanicidan aldigimiz 8 elemanli arrayin icinde
//        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
//         */
//
//        Scanner scan=new Scanner(System.in);
//
//        int sayilar[]= new int[8];
//
//        int sayac=0;
//
//        for (int i = 0; i < sayilar.length; i++) {
//            System.out.print(i+". index sayiyi girin: ");
//            sayilar[i]=scan.nextInt();
//
//            if (sayilar[i]%3==0){
//                sayac++;
//            }
//        }
//        System.out.println("3`e tam bolunebilen Array elemanlari adedi: "+sayac);
//
//
//
//        // **** Task14****
//        public static void main(String[] args) {
//
//        /*  TASK :
//        Write a method which accepts  string as parameter and prints the sum of digits
//        present in thr given string
//        Dizeyi parametre olarak kabul eden ve verilen dizgede bulunan rakamların toplamını
//        yazdıran bir yöntem yazın
//
//        input :"ade1r4d3"
//        output : 8
//        trick : Use --> Character.isDigit()
//                    --> Integer.valueOf()
//         */
//            String str = "ade1r4d3";
//
//            sayilariTopla(str);
//        }
//
//        private static void sayilariTopla(String str) {
//
//            String rakamArr[]=str.replaceAll("\\D","").split("");
//
//            int toplam1=0;
//
//            for (int i = 0; i < rakamArr.length; i++) {
//
//                toplam1+=Integer.parseInt(rakamArr[i]);
//            }
//            System.out.println("Toplam: "+toplam1);
//
//        }
//
    }
}
