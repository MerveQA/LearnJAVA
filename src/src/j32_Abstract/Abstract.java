package src.j32_Abstract;

public class Abstract {
    /*
    1- Bazi durumlarda child classlar parent clasdaki methodlari genellikle bodylerini degistirerek override ederler.
       Bu gibi durumlarda parent classtaki methoda body tanimlamak ram ve memory acisindan gereksizdir.
       Cozum olarak java parent classa bodysiz (abstract->soyut) methodlar tanimlamamistir.

    2- Parent classstaki abstract methodlar aplication guvenligi acisindan child classtan override edilmek zorundadir.
       Eger parent classtaki child classin mutlaka kullanmasi gereken method varsa abstact tanimlanmali.
       motor() her aracta olmali

    3- abstract method tanimlamak icin:
       a) {} body olmaz.
       b) access modifier sonrasi abstract keyword kullanilmali
       c) abstract medhod icinde abstract keyword ve {} body kullanilamaz aksi halde CTE verir.
          abstract class tanimlamak icin class ifadesinden once abstract keyword kullanilmali.

    4- Abstract methodlar sadece Abstract Classda tanimlanabilir kesinlikle concrete classda Abstract method tanimlanamaz
       Ama abstract classta concrete method tanimlanabilir.

    5- Abstract Class icinde hem abstract method hemde concrete method ve variable tanimlanabilir.

    6- Bir concrete child class parent abstract class extends ettiginde abstract methodlari implement etmek zorunda
       ama concrete methodlar istege gore override edilir.

    7- Parent child iliskisi olan Abstract Classlar abstract methodlari implement etmek zorunda degildir

    8- Parent olan abstract class birden cok concrete veya abstract child class extends edebilir.
       ancak child class birden cok abstract parent class'dan extends e-de-mezz...

    9- Abstract classda final ve Abstract method tanimlanamaz CTE -> final method override edilemyecegi için abs olamaz
    10-Abstract classda private ve Abstract method tanimlanamaz CTE -> private method override edilemyecegi için abs olamaz
    11-Abstract classda static ve Abstract method tanimlanamaz CTE -> static method override edilemyecegi için abs olamaz

    **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
    TRICK: Abstract Class'lar referansı child Class'ın objesini tutabilir (Polimorphism)
           Honda obj = new Civic(); -> honda oglu civic
           Civic obj1 = new Civic(); -> civic oglu civic
     */
}
