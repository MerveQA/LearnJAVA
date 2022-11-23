package src.j18_Constructor;

public class C03_Student { // main olmayan sadece student obj create etmek icin pojo ->
                           // plan old java object: obj icin standart class, kalıphane

    // BURADA DEFAULD CONSTRUCTOR VARDIR. //

    // fields
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet (){

        if(ortalama>=50){
            System.out.println("Diploman hayirli olsun");
        }else {
            System.out.println("Seneye de bekleriz");
        }
    }

    // toString() methodu create etmenin kısa yolu
    // Sag Tıkla -> Generate -> toString () -> Ok
    @Override
    public String toString() { // obj referans degeri print etmemesi için
                               // obj datalarini stringe ceviren metoddur
        return "C03_Student"+
                "\nad= " + ad +
                "\nsoyad= " + soyad +
                "\nsinif= " + sinif +
                "\nortalama= " + ortalama +
                "\nokulNo= " + okulNo +
                "\ntakdir= " + takdir;
    }
}
