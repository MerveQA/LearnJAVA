package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        // contains(); -> methodu list`te istenen elemanin varligini kontrol eder. true/false return eder.

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.contains("angara")); // false
        System.out.println(listSehir.contains("Munih")); // true

    }
}
