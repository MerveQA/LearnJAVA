package src.j26_Inheritance.Inheritance01;

public class Runner {
    /*
    1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
    2)Parent Class'a "super class"   Child Class'a "subclass"  denir.
    3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
    4)Parent Child Relationship
        "reusability" (tekrar Kullanılabilirlik),
        "maintenance"(Application’ın bakımı ve sürdürülmesi kolaylaşır),
        "less code"(daha az kod),
        "well organization" (Kolayca update yapabiliriz) avantajları içim kullanılır.
    5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
    6)Java "Multiple Inheritance'i" desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
    7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
      denir.
    8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
    9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir
    */

    public static void main(String[] args) {

        Hayvancik hayvan =new Hayvancik();
        hayvan.hareket();
        hayvan.icme();
        hayvan.yeme();

        System.out.println("\n***** Mammal m1 = new Mammal(); *****");

        Mammal m1 = new Mammal(); // Mammal Classindan obje uretildi
        m1.sutBeslenme(); // child mammal class
        m1.dogum(); // child mammal class
        m1.icme(); // parent Hayvancik class call
        m1.yeme(); // parent Hayvancik class call
        m1.hareket(); // parent Hayvancik class call

        System.out.println("\n***** Paluk hamsi = new Paluk(); *****");

        Paluk hamsi = new Paluk(); // Paluk Classindan obje uretildi
        hamsi.izgaraTava(); // Paluk classdan method call
        hamsi.hareket();  // parent Hayvancik class call
        hamsi.yeme(); // parent Hayvancik class call
        hamsi.icme();  // parent Hayvancik class call

        System.out.println("\n***** Kedi kd = new Kedi(); *****");

        Kedi kd = new Kedi();
        kd.cirmala();
        kd.hareket();
        kd.yeme();
        kd.icme();
        kd.dogum();
        kd.sutBeslenme();

        System.out.println("\n***** Koyun ky = new Koyun(); *****");

        Koyun ky = new Koyun();
        ky.semir();
        ky.hareket();
        ky.yeme();
        ky.icme();
        ky.dogum();
        ky.sutBeslenme();


    }
}
