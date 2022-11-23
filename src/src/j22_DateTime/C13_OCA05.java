package src.j22_DateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C13_OCA05 {
    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2); // coklu period parametresinde sonuncu kullanilir digerlerini ezer

        d = d.minus(p); // d`den 2 yil getiye git ve tekrar d`ye ata.

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));

        /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22 **
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
        */

        // Burada ardarda coklu period kullanilmis enson girilen periodu dikkate alir oncesinde yer alanlar ezilir
    }
}
