package src.j15_Arrays;

public class Task15 {
    public static void main(String[] args) {

       // TASK: arr tum elemanlarinin carpimini print eden code create ediniz

       int sayi[][]={{1,2,3},{9,8}};

       int carpim=1;

        for (int k = 0; k < sayi.length; k++) {
            for (int d = 0; d < sayi[k].length; d++) {
                carpim*=sayi[k][d];
            }
        }

        System.out.println(carpim);



    }
}
