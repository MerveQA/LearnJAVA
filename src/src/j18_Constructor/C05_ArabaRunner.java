package src.j18_Constructor;

public class C05_ArabaRunner {
    public static void main(String[] args) {

        C05_Araba arac1=  new C05_Araba(210);
        System.out.println("arac1.maxHiz = " + arac1.maxHiz); // arac1.maxHiz = 210
         // C05_Araba Classinda this. maxHiz yoruma alinirsa default deger alir

        System.out.println("arac1.model = " + arac1.model); // haci murat


    }
}
