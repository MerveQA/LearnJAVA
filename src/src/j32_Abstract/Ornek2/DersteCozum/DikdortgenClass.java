package src.j32_Abstract.Ornek2.DersteCozum;

public class DikdortgenClass extends SekilClass {
    public double uzunKenar;
    public double kisaKenar;

    public DikdortgenClass(double uzunKenar, double kisaKenar) { // Full parametreli -> Super
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }
}
