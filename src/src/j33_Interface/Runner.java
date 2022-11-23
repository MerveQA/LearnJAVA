package src.j33_Interface;

public class Runner {
    public static void main(String[] args) {

        Sahin doganGorunumluSahin =new Sahin();

        doganGorunumluSahin.ebat(); // 16 inc Lastik ebat
        doganGorunumluSahin.jant(); // Agam senin gibi adama celik jant yakisir
        doganGorunumluSahin.kapi(); // 4 kapi sedan
        doganGorunumluSahin.kaporta(); // akordion kaporta
        doganGorunumluSahin.klima(); // ac cami serinle klimasi
        doganGorunumluSahin.koltuk(); // deri koltuk
        doganGorunumluSahin.motor(); // 1.6 aile motor
        doganGorunumluSahin.yakit(); // Tuplu araba
        System.out.println("sisLamp() = " + doganGorunumluSahin.sisLamp()); // defauld conc. method -> obj ile call -> Sisli havada dikkat
        doganGorunumluSahin.sunroof(); // Gunesli havada sunroof acarsaan...

        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK); // Opak Girmizi
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK); // ahsap
        System.out.println("Lastik.RENK = " + Lastik.RENK); //  siyah beyaz yanakli
        //System.out.println("Lastik.RENK = " + RENK); -> ayni isimli variable`lar interface name ile call
        //IcDonanim.KUMAS="Deri"; -> CTE verir. final variable`a atama yapilmaz
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS); // kadife
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC); // arizona kertenkele style underground
        DisDonanim.anten(); // Static conc. method InterfaceName ile call -> Anten kuntin isler

    }
}
