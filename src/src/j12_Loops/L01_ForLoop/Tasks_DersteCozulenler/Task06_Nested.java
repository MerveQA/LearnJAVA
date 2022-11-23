package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

public class Task06_Nested {
    public static void main(String[] args) {

        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

        for (int i = 1; i <=10 ; i++) {      // 1`ler icin dis dongu bir defa calisiyor sonra ic donguye gecip
                                             // 1`i tek tek 1`den 10`a kadar carpiyor sonra
            for (int j = 1; j <=10 ; j++) {  // dis dongu 2`ye geciyor tekrar carpiyor....

                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }


    }
}
