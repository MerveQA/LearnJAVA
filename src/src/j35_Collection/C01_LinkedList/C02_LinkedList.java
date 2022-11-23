package src.j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object> list=new LinkedList<>(); // DataType Object (Hz.Adem)
        // Bad practice -> Aplication cok yavaslar bu yuzden tavsiye edilmez...

        list.add("Nazim");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list); // [Nazim, $, 1453]

    }
}
