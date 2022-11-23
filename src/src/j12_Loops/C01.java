package src.j12_Loops;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {


        int i, j, k, m;
        for(i=1; i<=5; i++) {

            System.out.print(i +" ");
            m = 4;
            k = i + m;
            for(j=1; j<i; j++) {
                System.out.print(k +" ");
                m--;
                k = k + m;
            }
            System.out.println();
        }






    }
}
