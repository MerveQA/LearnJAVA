package src.j14_Scope;

public class C01_InstanceVariable {
    /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda (ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note: Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
            "yas" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

    */
    static String kurs = "Clarusway";

    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMi;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk

    public static void main(String[] args) { // main baslangic

        int a = 7; // locale variable
        System.out.println(a); // 7

        //System.out.println(yas); // instance variable oldugu icin calismaz -> non-static oldugu icin dorudan cagrilamaz
        System.out.println(kurs);// static variable static methoda cagirildi.

        a=24;
        System.out.println(a);//24
        staticMethod();// static method call edildi.-> static olan main sadece static method eder

        // nonStaticMethod(); // static olmayan method call edilemez



        //obj creation -> ClassName objName = new ClassName(); *****************

        C01_InstanceVariable obj=new C01_InstanceVariable();
        obj.boy=1.9; // inst variable obj araciligiyla call edildi.
        obj.developerMi=true;
        obj.name="Kubra";
        System.out.println(obj.name); // Kubra
        System.out.println("obj.tecrube = " + obj.tecrube); // 0
        obj.yas=30;
        System.out.println(obj.yas); // 30


        C01_InstanceVariable obj2=new C01_InstanceVariable();
        obj2.boy=1.75;
        obj2.name="Fatih";
        System.out.println("obj2.boy = " + obj2.boy); //1.75
        System.out.println("obj2.name = " + obj2.name); // Fatih

    }// main sonu
    //a=23; // locale disi oldugu icin call edilemez

    public void nonStaticMethod(){ // Static olmayan method


        System.out.println("Static olmayan method");
    }

    public static void staticMethod(){ // Static method

        System.out.println("Static method");

    }

}
