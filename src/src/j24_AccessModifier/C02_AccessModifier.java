package src.j24_AccessModifier;

public class C02_AccessModifier {

    public static void main(String[] args) {

        // C01_AccessModifier obj1= new C01_AccessModifier();
        /*
        C01_AccessModifier classinda olusturdugumuz parametresiz constructor`i private yaptigimiz icin
        bu classtan (farkli bir classtan) erisemeyiz CTE verir.
         */
        C01_AccessModifier obj2= new C01_AccessModifier(23,45); //public 2 p'li cons call edildi

        C02_AccessModifier semra = new C02_AccessModifier(); // default p'siz cons.
        // C01_AccessModifier obj4 = C01_AccessModifier(); -> C01_AccessModifier classta parametresiz constructorun
        // Access Modifieri private oldugu icin farkli classtan erisilemez

        System.out.println("obj2.defauldYas = " + obj2.defauldYas); // 33
        obj2.protectedMethod(); // // protected method'dan agaya selam
        System.out.println("obj2.publicYas = " + obj2.publicYas); // 48
        System.out.println("obj2.protectedYas = " + obj2.protectedYas); // 40
        // obj2.privateMethod(); -> private method call edilemez.
    }
}
