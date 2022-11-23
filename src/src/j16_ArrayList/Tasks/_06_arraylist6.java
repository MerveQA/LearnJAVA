package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 1 olmalı.
     */

    public static void main(String[] args) {

        List<Integer> listSayilar =new ArrayList<>(List.of(5,4,6,2,1));

        hillNum(listSayilar);
        System.out.println(hillNum(listSayilar)); // 1
    }

    private static int hillNum(List<Integer> listSayilar) {
        int count=0;
        for (int i = 1; i < listSayilar.size()-1; i++) {
            if (listSayilar.get(i)<listSayilar.get(i-1)&& listSayilar.get(i)>listSayilar.get(i+1)){
                count++;
            }
        }
        return count;
    }
}
