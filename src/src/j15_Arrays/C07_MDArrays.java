package src.j15_Arrays;

public class C07_MDArrays {
    public static void main(String[] args) {

        //TASK: arr elemanlarini toplayan code create ediniz

        int arr [][]={{1,2,3},{10,20},{101}};

        int toplam=0;

        for (int k = 0; k < arr.length; k++) {
            for (int d = 0; d < arr[k].length; d++) {
                toplam+=arr[k][d];

            }

        }
        System.out.println(toplam); // 137

        /*
                  daire 0    daire 1    daire 2

          kat 0     1          2           3
          kat 1     10         20          -
          kat 2     100        -           -


         */



    }
}
