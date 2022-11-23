package src.j19_StaticVariable;

        /*
        => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
	 	=> Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
	 	=> Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması) default value ataması yapılır
	 	=> Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
	 	=> Bulunduğu  class icinden static yapılara  ulasilabilir.Farklı class'lardan ClassName.staticYapı class name ile call edilir.
	       farklı class'da obj name ile değl class name ile call edilir.
	 	=> Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
	       instance variable'a ulasilamaz.
	 	=> Static variable'lara object ile call edilebilir ama tavsiye edilmez.
	 	=> Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
        => static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

        bir obj static variable değeri değişirse tün obj variable değeri değişir
        static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

        Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..
        */

public class C01_Ogretmen {

    String isim; // instance variable
    int tecrube; // instance variable
    static String okul;

    public C01_Ogretmen(String isim, int tecrube) { // full parametrelı constructor
        this.isim = isim;
        this.tecrube = tecrube;
    }


    public static void maasHesapla() { // static method
        System.out.println("Maas hesaplamasi yapildi");

    }

    public void evlilikYilDonumu() { // non - static method
        System.out.println("Bir yastikta kocayin");

    }


}
