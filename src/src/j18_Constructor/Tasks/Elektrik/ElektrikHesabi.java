package src.j18_Constructor.Tasks.Elektrik;

import java.util.Scanner;

public class ElektrikHesabi {

    // fields:
    int toplamTuketim=0;
    double oran = 0.7;
    double fatura;


    public void tuketimEkle(int tuketim) {

        toplamTuketim += tuketim;

    }

    public double odenecekTutar() {

        fatura = (toplamTuketim * oran);

        return fatura;
    }
}
