package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim;

public class Runner {
    public static void main(String[] args) { // motor

        //GirisPaneli.giris(); // className ile method call
        GirisPaneli girisObj = new GirisPaneli();
        girisObj.giris(); // obj ile method call

        /*
        GirisPaneli Classtaki giris methodundaki static kismi kaldirilirsa
        oradan giris methodunu Class ismiyle direkt cagiramayiz.
        cagirmak icin Runner Classta GirisPanelinden obje olusturarak
        cagirabiliriz.
         */
        

    }
}
