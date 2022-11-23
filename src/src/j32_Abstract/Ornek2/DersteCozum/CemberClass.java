package src.j32_Abstract.Ornek2.DersteCozum;

public class CemberClass extends SekilClass{

   private double yariCap;
   private final double pi=3.14;

    public CemberClass(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }


    @Override
    public double alanHesapla() {
        return pi*this.yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*this.yariCap;
    }
}
