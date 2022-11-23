package src.j26_Inheritance.Inheritance02;

public class Runner {
    public static void main(String[] args) {

        System.out.println("***** Kedi kedi1 =new Kedi(); *****");
        //DataType  objeName     Constructor
        Kedi kedi1 = new Kedi();   // Constructor
        System.out.println("kedi1.a = " + kedi1.a); // 0 Hayvancik klasstan call edildi
        System.out.println("kedi1.c = " + kedi1.c); // 2 Mammilda da var ama kendisindede oldugu icinden kendinden call edilir
        System.out.println("kedi1.d = " + kedi1.d); // 5 Kedi classtan call edildi
        System.out.println("kedi1.m = " + kedi1.m); // 1 Mammal classtan call edildi

        /*
        Ayni isimli variable'lardan hangisinin kullanildigi++6
        olusturulan object'in data type'ina göre bilinir
        Variable'i arastirmaya data type'i classindan baslanır.
        */

        kedi1.mA(); // parentten gelir
        kedi1.mC(); // atasinda da var ama Kendi classinda oldugu icin kendi classindan gelir
        kedi1.mM(); // Mammaldan call edldi

        /*
        Method cagirilirken ayni isimli methodlardan
        hangisinin kullanilacagina Constructor karar verir.
        Methodlari arastirmaya Consctuctor ismini tasiyan
        class'dan baslayin ve parentlarda arastirmaya devam edin.
        */

        System.out.println("\n***** Mammal kedi2= new Kedi(\"Kevser\"); *****");

        Mammal kedi2 = new Kedi("Kevser"); // DataType -> Parent Mammal Class. Cons->p'li Kedi Class
        System.out.println("kedi2.c = " + kedi2.c); // 4 -> "Mammal kedi2 =" oldugu icin Mammal clastan(parenti) aramaya baslar yoksa g.parente bakar
        System.out.println("kedi2.a = " + kedi2.a); // 0 -> "Mammal kedi2 =" oldugu icin Mammal clastan(parenti) aramaya baslar yoksa g.parente bakar
        System.out.println("kedi2.m = " + kedi2.m); // 1 -> "Mammal kedi2 =" oldugu icin Mammal clastan(parenti) aramaya baslar yoksa g.parente bakar
        // kedi2.d -> CTE. = kedi2 objsinin Data type`i Mammal Class oldugu icin aramaya Mammal classtan baslar.
        // Mammal ve Hayvancik Classlarinda d variable olamadigi icin Call edilemez...

        kedi2.mA(); // mA -> "= new Kedi("Kevser");" oldugu icin Kedi classtan aramaya baslar. HAYVANCIK classtan method call
        kedi2.mC(); // mC -> "= new Kedi("Kevser");" oldugu icin Kedi classtan aramaya baslar. Kedi classtan method call edildi
        kedi2.mM(); // mM -> "= new Kedi("Kevser");" oldugu icin Kedi classtan aramaya baslar. Mammal class method call

        System.out.println("\n***** Hayvancik kedi3 = new Kedi(); *****");

        Hayvancik kedi3 = new Kedi();
        System.out.println("kedi3.m = " + kedi3.m); // 3
        System.out.println("kedi3.a = " + kedi3.a); // 0
        // kedi3.c -> DataType Hayvancik Class oldugu icin Hayvancik Class`da olmayan c call edilemezz... CTE verir.66
        kedi3.mA(); // mA -> HAYVANCIK classtan method call
        kedi3.mM(); // mM -> Mammal class method call

        System.out.println("\n***** Mammal m1 = new Mammal('$'); *****");

        Mammal m1 = new Mammal('$'); // Veriable ve methotlar icinde Mammal clastan calismaya baslar.
        System.out.println("m1.m = " + m1.m); // 1
        System.out.println("m1.a = " + m1.a); // 0
        System.out.println("m1.c = " + m1.c); // 4
        // m1.d -> parent mammal class child kedi classdan variable call edemez...
        m1.mA(); // Hayvancik class call
        m1.mC(); // Mammal class call
        m1.mM(); // Mammal class call


    }

}
