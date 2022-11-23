package src.j18_Constructor;

public class C05_Araba {

    // Fields -> obj.nin uretilirken alacagi deger variables
    int maxHiz;
    String model;

    // Bir Classta birden cok Constructor call edilebilir
    /*
    1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
       Aksi takdirde Compile Time Error alirsiniz.
    2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
       birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    public C05_Araba() { // parametresiz Constructor
    }

    public C05_Araba(int maxHiz) { // 1 parametreli Constructor
        this(180,"haci murat"); // 2 parametreli Cons. Call edildi. Ilk satira yazilmali yoksa CTE verir.

        maxHiz = maxHiz; // burada this olmadigi icin parametre degeri instans variable atanmaz.(this.maxHiz = maxHiz;) aktif degilse
                         // obj maxHiz, intance variable`da ne degeri varsa onu alir.
        this.maxHiz = maxHiz; // this keyword parametre degeri intance variable`a atama yapar.
                              // obj maxHiz degeri parametreden alir.
        System.out.println("Bu yaziyi okuyorsan Tek parametreli Constructor call edilmistir.");
    }

    public C05_Araba(int maxHiz, String model) { // 2 parametreli Constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("Bu yaziyi okuyorsan 2 parametreli Constructor call edilmistir.");
    }

    public C05_Araba(String model, int maxHiz) { // 2 parametreli Constructor (parametre sirasi farkli)
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("Bu yaziyi okuyorsan 2`li Constructor call edilmistir.");
    }




}
