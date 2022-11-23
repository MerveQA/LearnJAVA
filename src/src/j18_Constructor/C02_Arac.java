package src.j18_Constructor;

public class C02_Arac {
    // fields
    String marka;
    String model;
    int km=10;
    double motorHacim;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac(); // default cons ile arac1 obj create edildi.

        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHacim=2.4;
        //                   volvo           xc60           50000       default=0          true               2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yil+" "+arac1.ikinciEl+" "+arac1.motorHacim);

        //TASK: 2. bir aracin tum fieldlerini atayarak print ediniz

        C02_Arac arac2 = new C02_Arac();
        arac2.ikinciEl=true;
        arac2.marka="toyota";
        arac2.km=95000;
        arac2.model="corolla";
        arac2.motorHacim=1.6;
        arac2.yil=2010;
        arac2.vitesAuto= false;

        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yil+" "+arac2.ikinciEl+" "+arac2.motorHacim+" "+arac2.vitesAuto);
        // toyota corolla 95000 2010 true 1.6 false

        System.out.println("arac2 = " + arac2); //arac2 = j18_Constructor.C02_Arac@5c7fa833
    }

   //@Override ----Tum obje fieldleri print edildi
   //public String toString() {
   //    return "C02_Arac" +
   //            "\nmarka= " + marka +
   //            "\nmodel= " + model +
   //            "\nkm= " + km +
   //            "\nmotorHacim= " + motorHacim +
   //            "\nvitesAuto= " + vitesAuto +
   //            "\nikinciEl= " + ikinciEl +
   //            "\nyil= " + yil;
   //}


    @Override // istedigimiz ozellikleri yazdirip istedigimiz sildirebiliriz
    public String toString() {
        return "C02_Arac" +
                "marka= " + marka +
                "model= " + model +
                "motorHacim= " + motorHacim +
                "vitesAuto= " + vitesAuto +
                "yil= " + yil;
    }
}
