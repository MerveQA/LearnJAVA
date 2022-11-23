package src.j18_Constructor;

public class C01_Constructor {

    /*
    1- constructor ismi Class name ile ayni olmali. Buyuk harf ile baslamali
    2- constructor create edildiginde name`den sonra () {} mutlaka kullanilmalidir
    3- eger parametreli constructor create edilirse java default constructor'u ezer(siler)
    4- constructor"ın return type olmaz metoddan ayiran ozelligidir
    5- class olustugunda java default constructor'ı kendi create eder.
     */
    String str; // instans variable -> obje variable
    String selam= "guzel insan";

    public static void main(String[] args) {

       // class name     obje name     new keyword    defauld constructor
        C01_Constructor     obj1    =      new         C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        obj1.str="javacan"; // str instance variable obj1 ile call edilerek obj1 icin javacan degeri atandi.
        obj2.str="javatar"; // str instance variable obj2 ile call edilerek obj2 icin javatar degeri atandi.

        System.out.println(obj3.selam); // guzel insan

        System.out.println(obj1.str); // javacan
        System.out.println(obj2.str); // javatar
        System.out.println(obj4.str); // null

        obj3.aga(); // agaya selam (aga methodu static olmadigi icin direkt main methoda cagiramadik.
                                 // obje3 uzerinden ulasıp calıstırabildik)
        obj2.aga(); // agaya selam (aga methodu static olmadigi icin direkt main methoda cagiramadik.
                                 // obje2 uzerinden ulasıp calıstırabildik)


    }

    public void aga(){
        System.out.println("agaya selam");


    }

}
