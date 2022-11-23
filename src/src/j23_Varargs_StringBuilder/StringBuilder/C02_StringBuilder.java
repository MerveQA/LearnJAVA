package src.j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder obje create etme
        //1.YOL:
        StringBuilder sb1 = new StringBuilder();// defauld kapasity, 16 bit olan ve value`su olmayan
        System.out.println("sb1.length() = " + sb1.length()); // 0
        // length() -> StringBuilder karakter sayisini return eder
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16
        sb1.trimToSize();
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 0
        // capacity() -> StringBuilder`in kapasitesini verir, yani hafizada kapladigi alani elde ederiz.

        sb1.append("javatar"); // javatar sb1`e eklendi.
        System.out.println("sb1 = " + sb1); // javatar
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16

        sb1.append(" selam ").append("olsun ").append(24).append(" ").append(true); // javatar selam  olsun 24 true
        System.out.println("sb1 = " + sb1);
        // append() -> StringBuilder`a ekleme yapmak icin kullanilan methoddur. add() methoduna benzer.
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 34

        sb1.append(" basari gayrete asiktir.");
        System.out.println("sb1 = " + sb1); // javatar selam olsun 24 true basari gayrete asiktir.
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 70
        System.out.println("sb1.length() = " + sb1.length()); // 51

        //2.YOL:
        StringBuilder sb2 = new StringBuilder("Kevser hanima selamlar"); // ilk deger atamasi yapilmis sb1 StBuild. obj.
        System.out.println("sb2 = " + sb2); // Kevser hanima selamlar
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 38

        // trimToSize() -> fazladan bos capasity silinir. SB`in kapasitesini length`ine esitler.
        System.out.println("sb2.length() = " + sb2.length()); // 22
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 38
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 22 (38-22=16) karakterlik defauldluk hafizadaki alani sildi

        //3.YOL:
        StringBuilder sb3 = new StringBuilder(11); // hafizada 11 karakterlik yer ayiran bos sb. tanimlandi.
        System.out.println("sb3.length() = " + sb3.length()); // 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // 11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());// 24

        //charAt() -> istenen bir indexdeki characteri alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12)); // m

        // subSequence() -> belirli bir araliktaki charakterleri alma burada baslangic ve bitis indexi belirtilmeli tek calismaz
        // substring()
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13)); // atar selam
        System.out.println("52 satir sb1 = " + sb1);
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13)); // atar selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17)); // un 24 true basari gayrete asiktir.


        // deleteCharAt() -> belirli bir indexteki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3)); // javtar selam olsun 24 true basari gayrete asiktir.
        // 3. indexteki a karakteri silindi.
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7)); // javselam olsun 24 true basari gayrete asiktir.
        // 3.4.5.6. index karakterler silindi
        System.out.println("sb1 = " + sb1); // javselam olsun 24 true basari gayrete asiktir.

        // insert() -> istenen karekter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3); // ebubekir bey
        System.out.println("sb3.insert(4,:)) = " + sb3.insert(4, ":)")); // ebub:)ekir bey
        String s = "guzel insan";
        // System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));// ebub:)ekiguzel insanr bey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7)); // eel ibub:)ekir bey
        //sb3`un 1. indexine s Stringinin 3. index dahil 7. index haric index elemanlari eklendi

        StringBuilder sb4 = new StringBuilder("Nihan hanim");
        System.out.println("sb4.insert(5, Qa team lead,0,2) = " + sb4.insert(5, "Qa team lead", 0, 2)); // NihanQa hanim

        // setCharAt() -> istenen indexteki karakterleri degistirme...
        sb4.setCharAt(6, 'A');
        System.out.println("sb4 = " + sb4); // NihanQA hanim
        sb4.setCharAt(sb4.indexOf(" "), ':');
        System.out.println("sb4 = " + sb4); // NihanQA:hanim
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " "));// Nihan QA:hanim

        // replace() -> istenen indexe karakter yerine birden cok karakter eklemek.
        System.out.println("sb4.replace(8,10,\"DE\") = " + sb4.replace(8, 10 , "DE")); // Nihan QADEanim

        // toString() -> StringBuilder objeyi Stringe cevirme
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase()); // EEL İBUB:)EKİR BEY

        // compareTo() -> String ile StringBuilder karsilastirmasi

        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
        */

        StringBuilder sb5= new StringBuilder("javaCAN");
        StringBuilder sb6= new StringBuilder("javaCAN");
        String str1= "javaCAN";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); // 0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1))); // 0
        // sb6.compareTo(str1) // CTE verir.

        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5)); // false
        // TRICK: StringBuilder`da equals == gibi calisir. Hem value hemide referansa bakar.

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString())); //true
        // burada equals String methodundaki gibi calisti sadece value`ye bakti. referans degerini dikkate almadi.

    }
}
