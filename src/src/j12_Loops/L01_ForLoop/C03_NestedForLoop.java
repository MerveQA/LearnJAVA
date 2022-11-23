package src.j12_Loops.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        Eger bir dongunun body`sinde baska bir dongu bulunuyorsa bu tur dongulere nested Loop (icice dongu) denir.
        Ic dongu dis dongunun her adiminda tekrar calisir.
        Icice dongulerde en icdeki dongu en once calisir.
         */

        for (int apt = 1; apt <=10 ; apt++) { // dis dongu
            System.out.println("Apt. dongu: "+apt);
            for (int daire = 1; daire <6 ; daire++) { // ic dongu

                System.out.println("Apt.: "+apt+" icin daire: "+daire);
            }
        }




    }
}
