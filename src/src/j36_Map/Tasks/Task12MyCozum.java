package src.j36_Map.Tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class Task12MyCozum {
    public static void main(String[] args) {

        // Task -> Ad ve soyad bulunduruan iki ayrı array'i bir map'de print eden code create ediniz.
        // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};

        String [] isim ={"ahmet", "ahmet can", "haluk"};
        String [] soyIsim ={"şeref", "erdem", "bilgin"};

        HashMap <String,String>adSoyad =new HashMap<>();

        for (int i = 0; i < isim.length; i++) {
            for (int j = 0; j <= i; j++) {
                adSoyad.put(isim[i], soyIsim[j]);
            }
        }

        System.out.println("adSoyad = " + adSoyad);
    }
}
