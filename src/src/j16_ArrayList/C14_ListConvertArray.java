package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

        // Listi Arraya cevirme -> toArray();
        // 1. YONTEM toArray(); parametre olarak new String[0] yazılır.

        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]); // ulke listi elemanlari arrUlke olarakatandi.

        System.out.println("list: "+listUlke); // [Alamanya, Amerigonya, ingiltere, isvec]
        System.out.println("Array: "+Arrays.toString(arrUlke)); // [Alamanya, Amerigonya, ingiltere, isvec]

        String arrUlke1[]=listUlke.toArray(new String[2]);
        System.out.println("arrUlke1: "+Arrays.toString(arrUlke1)); // [Alamanya, Amerigonya, ingiltere, isvec]
        String arrUlke2[]=listUlke.toArray(new String[5]);
        System.out.println("arrUlke2: "+Arrays.toString(arrUlke2)); // [Alamanya, Amerigonya, ingiltere, isvec, null]


        //2.YONTEM: olusturulan Arrayin data type Object olarak atanir.
        //TRICK: Object Class java`da tum Class`larin parent(atasi:Hz Ademidir.)
        // Object Clas javada parenti olmayan tek Classdir. (tum vagonlari ceken ama cekilemez lokomotif)
        // String Integer Class`lar Objeckt Class child`i oldugu icin istenen durumlarda data type olarak object class kullanılabilir
        Object arrUlkeler []=listUlke.toArray();
        System.out.println("Object ile: "+Arrays.toString(arrUlke)); //[Alamanya, Amerigonya, ingiltere, isvec]






    }
}
