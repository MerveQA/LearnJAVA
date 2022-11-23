package src.j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="murat"; // ilk degeri murat atanan str1 variable
        String str2="murat"; // str1 ve str2 ayni ilk degere sahip oldugu icin String havuzunda ortak referansa atanir.

        String str3=new String("murat"); // degerleri ayni referanslari farkli obje
        String str4=new String("murat"); // degerleri ayni referanslari farkli obje

        String str5= str1+"";

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str3 == str4); // false
        System.out.println(str1 == str5); // false
        System.out.println(str1.equals(str5)); // true

        System.out.println(str1 == "murat"); // true

    }
}
