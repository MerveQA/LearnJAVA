package src.j08_IfStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        //int krmYas = 33;
        //int ismYas = 40;
        int krmYas = 45;
        int ismYas = 63;

        if (krmYas == ismYas) {
            System.out.println("Ayni yastasiniz");
            System.out.println("ikizmisiniz");
        }
        if (krmYas >= 40) System.out.println("Kerim bey olgunluk yasindasiniz");
        // if blokta {} kullanilmazsa ; kadar olan kod satiri if sartina baglidir
        System.out.println("14. satir iften bagimsiz");
        if (krmYas + ismYas > 100) {
            System.out.println("kerim ve ismailin yaslari toplami 100den buyuk");
        }
        System.out.println("selam javacanlar");
        /*
        Bagimsiz if bloklari sadece kendi scop(kapsamlarini) kosulu saglarsa run eder.
        Birden fazla bagimsiz if statement yapilari hepsinin body`leri calisabilecegi gibi
        hicbirini body`leride calismayabilir.
         */

        // Ctrl + alt + L reformat sayfayi duzenler



    }
}
