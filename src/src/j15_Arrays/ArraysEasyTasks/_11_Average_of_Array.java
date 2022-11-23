package src.j15_Arrays.ArraysEasyTasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*   _11_Average_of_Array

        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        int sayiArr[]={12, 14 , 21 ,23 , 10 ,4};


        int sum=0;
        int count=0;

        for (int i = 0; i < sayiArr.length; i++) {
            sum+=sayiArr[i];
            count++;
        }
        System.out.println("Array'in ortalaması: "+(sum/count)); // 14

    }
}