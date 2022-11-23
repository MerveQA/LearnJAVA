package src.j13_Break_Continue;

public class C05_OCA_type {
    public static void main(String[] args) {

        int count = 0;
        /*
        ROW_LOOP: for (int row = 1; row <= 3; row++) // suslu yok
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
        */

        for (int row = 1; row <= 3; row++){
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;
                count++;
            }
        }
        System.out.println(count);
        /*
         dis for ilk turda 1`i, ikinci turad 2`yi ve ucuncu turda 3`u sira ile calistiracak ve
         her dis turda ic for tum verileri calistiracak yani her dis turda 1 ve 2`yi calistiracak
         ilk turda      1*1 ve 1*2
         ikinci turda   2*1 ve 2*2
         ucuncu turda   3*1 ve 3*2 calistiracak
         carpimlarin sonu cift sayi ise continue ile atlar ve elimizde 1*1 ve 3*1 kalir count 2 olur
         */


    }
}
