package src.j33_Interface;

public interface DisDonanim {

    public void kapi(); // abs. method

    abstract void kaporta(); // abs. method

    String RENK = "Opak Girmizi"; // public static final variable`dir

    public default String sisLamp() { // defauld conc. method

        return "Sisli havada dikkat";
    }

    static void aga() {
        System.out.println("agam sensiz olmaz");
    }

    static void anten() {
        System.out.println("Anten kuntin isler");
    }

    //DisDonanim obj = new DisDonanim(); // connat be instantiated -> obj olamaz

    //private static default  void sorunMethode (){ } -> static default keyword ayni anda kullanilmaz


    //public static void main(String[] args) { // bad practice -> projede tek bir main method ve main class kullanilmali.
    //    System.out.println("RENK = " + RENK);
    //    aga(); // static method call
    //}
}
