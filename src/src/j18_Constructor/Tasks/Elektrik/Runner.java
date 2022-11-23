package src.j18_Constructor.Tasks.Elektrik;

public class Runner {

    public static void main(String[] args) {

        Musteri musteri =new Musteri();
        musteri.name="Aga";

        ElektrikHesabi hsb1 =new ElektrikHesabi();

        musteri.elektrikHesabi=hsb1;

        musteri.elektrikHesabi.tuketimEkle(100);
        musteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("toplam Tuketim: "+musteri.elektrikHesabi.toplamTuketim);

        System.out.println("Odenecek Tutar: "+musteri.elektrikHesabi.odenecekTutar());

    }




}
