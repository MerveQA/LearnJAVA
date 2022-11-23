package src.j15_Arrays;

public class Task16 {
    public static void main(String[] args) {

        //TASK: Sayi arrayindaki son elemanlarin carpimini print eden kod yaziniz

        int sayi[][]={{1,2,3},{9,8},{24,0,4}};

        int carpim=1;

        // 1. YONTEM:  Hocanin cozumu
        for (int k = 0; k < sayi.length; k++) {
            carpim*=sayi[k][sayi[k].length-1]; // kat 0`a git' kat 0`daki dairelerin boyutundan 1`i cikar o indexteki daireyi bana getir.
        }


        //2. YONTEM: My cozum
        int carpim1=1;

        for (int k = 0; k < sayi.length; k++) {
            for (int d = sayi[k].length-1; d <sayi[k].length ; d++) {
                carpim1*=sayi[k][d];
            }
        }


        System.out.println("carpim = " + carpim);
        System.out.println("carpim 1= " + carpim1);
    }
}
