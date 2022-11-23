package src.j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

      /*
      concat() methodu icine (parametre) aldigi string variable`i calistigi stringin sonuna ekler.
      Javada + islemi yapilirken eger en az bir string variable varsa java toplama degil concat yapar.
       */

        String name= "Nur";
        String meslek= " Qa tester";
        System.out.println(name.concat(meslek)); // Nur Qa tester
        System.out.println(name); // Nur

        // TRICK: String methodlari variable`da gecici degisiklik yapar ama atama yapilirsa kalici hale gelir

        name=meslek.concat(name);
        System.out.println(name); //  Qa testerNur

        System.out.println(name.concat(true + " :)")); //  Qa testerNurtrue :)
        System.out.println(name.concat(100 + " :)")); //  Qa testerNur100 :)
        System.out.println(name.concat(100+"")); //  Qa testerNur100
        System.out.println(name.concat(""+100)); //  Qa testerNur100
        //System.out.println(name.concat(100)); //  CTE

        // TRICK: concat() methodu parametre olarak String harici tum datalari Stringe cevirip concat eder.
        //       Parantez icerisinde enaz 1 tanede String data bulunmalı yoksa CTE verir.


    }
}
