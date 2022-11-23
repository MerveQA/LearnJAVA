package src.HaftanınTaskiii;

import java.util.*;

public class T08_ArrayList {
    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
    public static void main(String[] args) {

        ArrayList<String> calisanlarList = new ArrayList<>(List.of("Ali","Ayse","Arda"));
        ArrayList<String> isverenlerList = new ArrayList<>(List.of("Banker Bilo","Banker Maho","Banker A"));
        ArrayList<String> sirketlerList = new ArrayList<>(List.of("A Bank","B Bank","C Bank"));

        ArrayList<ArrayList<String>> ikiBoyutluList = new ArrayList<>(Arrays.asList(calisanlarList, isverenlerList, sirketlerList));

        System.out.println(ikiBoyutluList);



    }



}
