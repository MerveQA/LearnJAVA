package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Sublist {
    public static void main(String[] args) {

        // sublist(); -> listten istenen list parcasini return eder.

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm", "Angara","pataGONYA"));

        System.out.println(listSehir.subList(3, 5));// [Stockholm, Angara] -> 3. index dail 5. index haric verir.

        ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5)); // listSehir`den 2.3.4 index elemanlari city liste atandi.
        System.out.println("city = " + city); // [Londra, Stockholm, Angara]
    }
}
