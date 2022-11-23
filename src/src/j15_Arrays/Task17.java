package src.j15_Arrays;

public class Task17 {
    public static void main(String[] args) {

        //TASK: sayi arrayindaki en buyuk elemani print eden kod yaziniz

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};

        int maxEleman=sayi[0][0];

        for (int k = 0; k < sayi.length; k++) {

            for (int d = 0; d < sayi[k].length; d++) {

                if (maxEleman<sayi[k][d]){
                    maxEleman=sayi[k][d];
                }
            }
        }
        System.out.println(maxEleman);

    }
}
