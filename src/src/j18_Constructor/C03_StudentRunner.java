package src.j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrenci1= new C03_Student(); // ogrenci1 objesi create edildi

        ogrenci1.ad="fatih";
        ogrenci1.soyad="atas";
        ogrenci1.sinif=1;
        ogrenci1.okulNo=1001;
        ogrenci1.ortalama=77;
        ogrenci1.takdir=false;

        System.out.println("ogrenci1 = " + ogrenci1); // j18_Constructor.C03_Student@5f2050f6

        /* C03_Student Classsinda toStrin () methodu olusturulunca yazdirildi
        ogrenci1 = C03_Student
        ad= fatih
        soyad= atas
        sinif= 1
        ortalama= 77.0
        okulNo= 1001
        takdir= false
         */

        ogrenci1.mezuniyet(); // Diploman hayirli olsun

        //TASK: Diger bir ogrenci objesi ile tum fieldleri atayip print ediniz

        C03_Student ogrenci2= new C03_Student(); // ogrenci1 objesi create edildi

        ogrenci2.ad="Arda";
        ogrenci2.soyad="TAS";
        ogrenci2.sinif=3;
        ogrenci2.okulNo=201;
        ogrenci2.ortalama=44;
        ogrenci2.takdir=false;

        ogrenci2.mezuniyet();


        System.out.println("ogrenci2 = " + ogrenci2); // Seneye de bekleriz

        /*
        ogrenci2 = C03_Student
        ad= Arda
        soyad= TAS
        sinif= 3
        ortalama= 44.0
        okulNo= 201
        takdir= false

         */


    }
}
