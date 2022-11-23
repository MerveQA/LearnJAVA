package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {

        // get(); -> listte indexi girilen elemani getirir. (arr[3]->arr`nin 3. indexdeki elemanini ver.)

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir.get(1)); // LosAngeles
        System.out.println(listSehir.get(11)); // IndexOutOfBoundsException -> olmayan index elemani RTE

    }
}
