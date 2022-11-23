package src.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {

    //task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor print eden code create ediniz.
    public static void main(String[] args) {

        ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        ListIterator<Integer> it1=numList.listIterator();

        while (it1.hasNext()){
            int num=it1.next();
            if (num%2!=0){
                it1.set(num*num);
            }else {
                it1.remove();
            }
        }
        System.out.println(numList); // [169, 529, 2025]

        while (it1.hasPrevious()){
            System.out.print(it1.previous()+ " "); // 2025 529 169
        }

    }
}
