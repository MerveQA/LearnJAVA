package src.j15_Arrays.ArraysEasyTasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
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

    }
}

