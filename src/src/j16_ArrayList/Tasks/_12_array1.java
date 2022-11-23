package src.j16_ArrayList.Tasks;

import java.util.Arrays;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

     int[] arr = {1,2,3,1};

        dupicate(arr);
        System.out.println(dupicate(arr)); //true
    }

    private static boolean dupicate(int[] arr) {

        boolean tekrarVarMi=false;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                tekrarVarMi=true;
            }

        }

        return tekrarVarMi;
    }
}