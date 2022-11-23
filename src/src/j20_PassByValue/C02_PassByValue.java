package src.j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        
        // TASK: verilen fiyat icin %11 %22 ve %33 indirimli fiyati print eden methodlar create ediniz.
        
        double fiyat =100; // primitiv double type variable

        System.out.println("method call oncesi fiyat = " + fiyat);

        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));

        System.out.println("method call sonrasi fiyat = " + fiyat);


    }

    private static double indir33(double fiyat) {
        return fiyat*0.67;
    }

    private static double indir22(double fiyat) {
        return fiyat*0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat*0.89;
    }
}
