package src.j17_ForEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        //TASK: array elemanlainin carpimini print eden code create ediniz -> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};

        int carpim = 1;

        for (int[] w : arr) { // dis for-each, arr"nin ic arraylerini forun icerisine aldi. ic arrayin elemanlarina hala ulasmis degiliz.

            for (int a : w) { // ic for-each ise dis for-each`in aldigi ic arraylerin elemanlarina ulasti ve teker teker a degiskenine gonderdi.
                carpim *= a;
            }

        }
        System.out.println(carpim);


    }
}
