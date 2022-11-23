package src.j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kendisi değil de dataları geğişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */

        /*
        TASK: list elemanlari 24,20,87 iki farkli method ile list elemanlarini
              update edip print eden code create ediniz.
         */

        //1. Method foreach, 2. method set()

        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));

        System.out.println("method oncesi list = " + list); // [24, 20, 87]

        listUpdate1(list); // [24, 20, 87]
        listUpdate2(list); // [48, 40, 174]

        System.out.println("method sonrasi list = " + list); // [48, 40, 174] -> Pass By Referans

    }
    public static void listUpdate1(List<Integer> list){ // 1. Method foreach

        for (Integer w:list) { // burada listin elemanlari alinip kullanildi.
            w*=2;              // orjinal list`te dokunulmadigi icin elemanlar degismedi
        }
        System.out.println("1. method foreach= " + list);
    }

    public static void listUpdate2(List<Integer> list){ // 2. method set()

        for (int i = 0; i < list.size(); i++) { // burada list uzerinde degisikli yapildi. oyuzden elemanlar degisti
            list.set(i,list.get(i)*2);

        }
        System.out.println("2. method set()= " + list);
    }

}
