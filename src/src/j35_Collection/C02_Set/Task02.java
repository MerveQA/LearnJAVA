package src.j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {

        /*
        interview question: girilen String datanin karakterlerini alfabetik print ediniz. -> TreeSet`e atanir...
        hashSet ve treeSet tanimlayip run surelerini karsilastiriniz.
        TRICK: run suresi icin System.currentTimeMillis() method call ediniz.
        */

        long tsBaslangic =System.currentTimeMillis();

        TreeSet <String> ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Haluk");
        ts.add("Harun");
        ts.add("Hasan");
        ts.add("Hasmayan");
        ts.add("Koray");
        long tsBitis =System.currentTimeMillis();
        System.out.println("ts run suresi: "+(tsBitis-tsBaslangic));
        System.out.println();

        long hsBaslangic =System.currentTimeMillis();
        HashSet<String>hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("filan");
        hs.add("feşmekan");
        hs.add("agam");
        hs.add("bobrek yatagı");
        hs.add("poc guvec");
        hs.add("kusleme");

        long hsBitis =System.currentTimeMillis();
        System.out.println("hs run suresi: "+(hsBitis-hsBaslangic));
    }
}
