package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

public class Task05_Nested {
    public static void main(String[] args) {

        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        seklini print eden code create ediniz
         */

        for (int i = 1; i <=5 ; i++) { // Dis dongu

            for (int j = 1; j <=5 ; j++) { // Ic Dongu

                System.out.print("# ");
            }
            System.out.println(" "); // dummy hayalet komut islevi olmayan altsatira atlatan komut
            // ic dongu bir tur attiginda tekrar tura alt satirdan baslamasi icin
            // dis dongunun icine ama ic dongunun disina sout atilir.
        }


    }
}
