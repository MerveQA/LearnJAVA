package src.j15_Arrays.ArraysEasyTasks;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
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


    }
}