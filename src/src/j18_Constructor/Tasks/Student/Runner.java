package src.j18_Constructor.Tasks.Student;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Lesson fzk =new Lesson();
        fzk.lessonName="Fizik";
        fzk.credit=3;

        Lesson kmy = new Lesson();
        kmy.lessonName= "Kimya";
        kmy.credit=6;

        Lesson trh = new Lesson();
        trh.lessonName= "Tarih";
        trh.credit=4;

        Student ogr1 =new Student();
        ogr1.name="Aga";
        ogr1.maxCredit=10;
        ogr1.dersListesi=new ArrayList<>();

        if (ogr1.toplamKredi()+fzk.credit<=ogr1.maxCredit){
            ogr1.dersListesi.add(fzk);
        }else {
            System.out.println("Kredi miktarını aştınız. "+fzk.lessonName + " dersini alamazsınız");
        }

        if (ogr1.toplamKredi()+kmy.credit<=ogr1.maxCredit){
            ogr1.dersListesi.add(kmy);
        }else {
            System.out.println("Kredi miktarını aştınız. "+kmy.lessonName + " dersini alamazsınız");
        }

        if (ogr1.toplamKredi()+trh.credit<=ogr1.maxCredit){
            ogr1.dersListesi.add(trh);
        }else {
            System.out.println("Kredi miktarını aştınız. "+trh.lessonName + " dersini alamazsınız");
        }

        for (Lesson x: ogr1.dersListesi) {
            System.out.println(x.lessonName+" "+x.credit);
        }


    }
}
