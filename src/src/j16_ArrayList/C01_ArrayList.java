package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi=33; // Tek bir data saklayabilen variable
        int sayi1[]=new int[5]; // 5 int deger saklayabilen yapi
        int sayi2[][]=new int[5][6]; // 5*6 = 30 int deger saklayabilen yapi

        ArrayList<Integer> sayiList= new ArrayList<>(); // istenildigi kadar int deger saklayan yapi

        /*
        Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harfle baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...
            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

        List declarations(tanımlama) :
        Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
        eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.

        key word: List<Wrapper Class> name=

        List'e assaign etme(atama) :
        List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
        List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
        List<wrapper Class> name = new ArrayList<>() *****doğru
        List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
        ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

        List'e ilk değer atama (initialize):....
        1.yol : asList();
        ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
        2.yol : Listof();
        ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

        ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
        Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.

        Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.
        */

        // List create etme ve deger atama...
        ArrayList<Integer> listSayi= new ArrayList<>(); // bos integer type list olusturuldu.

        //1. YOL: add(); methodu
        System.out.println("listSayi = " + listSayi); //[]
        listSayi.add(10); // liste ilk eleman olarak 10 degeri eklendi
        System.out.println("listSayi = " + listSayi); //[10]
        listSayi.add(39);
        listSayi.add(72);
        listSayi.add(61);
        listSayi.add(41);
        listSayi.add(41); // list eleman tekrarini kabul eder.
        System.out.println("listSayi = " + listSayi); // [10, 39, 72, 61, 41, 41]

        //2. YOL: Arrays.toList(); methodu
        ArrayList<String> listIsim= new ArrayList<>(Arrays.asList("Muharrem","Nur","Enise","Fatih"));
        System.out.println("listIsim ="+listIsim);// [Muharrem, Nur, Enise, Fatih]

        //3. YOL: List.of() methodu
        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));

        listSayi.add(2,14); // index 2`ye 14 degerini ekledi. 2.indexdeki eski eleman bir ileri kaydi
        System.out.println("listSayi = " + listSayi); // [10, 39, 14, 72, 61, 41, 41]

    }
}
