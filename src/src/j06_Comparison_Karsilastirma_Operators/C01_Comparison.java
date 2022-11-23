package src.j06_Comparison_Karsilastirma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {

        /*
        ==     Esit               x == y
        !=     Esit degil         x != y
        >      buyuk              x > y
        <      kucuk              x < y
        >=     buyuk esit         x >= y
        <=     kücük esit         x <= y
        */

        int slmYs= 33;
        int krmYs= 41;
        System.out.println("Yaslari esit mi: "+ (krmYs==slmYs)); // false
        System.out.println("Yaslari esit degil mi: "+ (krmYs!=slmYs)); // false
        System.out.println("krm bey kucukmu slm bey: "+ (krmYs<slmYs)); // false
        System.out.println("krm bey buyukmu slm bey: "+ (krmYs>slmYs)); // true

        /*
        s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
        s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
        String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır.
        */

        String s1= "kerem bey";
        String s2= "kerem bey";
        System.out.println(s1==s2); //true






    }
}
