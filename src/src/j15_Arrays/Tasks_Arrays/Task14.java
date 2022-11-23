package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {

        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        Dizeyi parametre olarak kabul eden ve verilen dizgede bulunan rakamların toplamını
        yazdıran bir yöntem yazın

        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";

        sayilariTopla(str);
    }

    private static void sayilariTopla(String str) {

        String rakamArr[]=str.replaceAll("\\D","").split("");

        int toplam1=0;

        for (int i = 0; i < rakamArr.length; i++) {

            toplam1+=Integer.parseInt(rakamArr[i]);
        }
        System.out.println("Toplam: "+toplam1);

    }


    /*
    String arr[]=str.split("");

        System.out.println(Arrays.toString(arr));

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("1")||arr[i].contains("2")||arr[i].contains("3")||arr[i].contains("4")||arr[i].contains("5")||
                    arr[i].contains("6")||arr[i].contains("7")||arr[i].contains("8")||arr[i].contains("9")||arr[i].contains("0") ) {

                toplam+= Integer.parseInt(arr[i]);
            }
        }

        System.out.println(str+", dizesindeki rakamlarin toplami: "+toplam);


     */


}

