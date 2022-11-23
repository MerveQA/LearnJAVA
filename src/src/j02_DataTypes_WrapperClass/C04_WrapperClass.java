package src.j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name= "Haluk";
        int yas= 33;
        System.out.println(name.toUpperCase()); // HALUK

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        ancak primitive data turlerinin boyle bir ozelligi yoktur
        primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        ara çözüm imkanı sunmuştur.
         */

        // TASK id ve tc String degerlerinin toplamini print eden code yaziniz.
        String tc= "1234455";
        String id= "98765";
        System.out.println(tc+id);// concat->birlestirme : 123445598765

        int yeniTc= Integer.valueOf(tc);// tc String degerini int cevirdik ve atama yaptik.
        System.out.println("yeniTc = " + yeniTc);

        int yeniId= Integer.valueOf(id);// id String degerini int cevirdik ve atama yaptik.
        System.out.println("yeniId = " + yeniId);

        System.out.println("Toplam: "+ (yeniTc+yeniId)); // aritmetik toplama yapar. 1333220

        String okulNo= "234543A";

        //int yeniOkulNo=Integer.valueOf(okulNo);
        //System.out.println(yeniOkulNo); // NumberFormatException RTE

        System.out.println("madem geldin dunyaya otur calis javaya");

        //TASK: byte short int max. ve min. degerlerini print eden code yaziniz.
        byte maxByteDegeri= Byte.MAX_VALUE;
        byte minByteDegeri= Byte.MIN_VALUE;
        System.out.println("maxByteDegeri: " + maxByteDegeri);
        System.out.println("minByteDegeri: " + minByteDegeri);

        int maxIntegerDegeri= Integer.MAX_VALUE;
        int minIntegerDegeri= Integer.MIN_VALUE;
        System.out.println("maxIntegerDegeri: "+maxIntegerDegeri);
        System.out.println("minIntegerDegeri: "+minIntegerDegeri);

        System.out.println("maxShortDegeri: " + Short.MAX_VALUE);
        System.out.println("minShortDegeri: " + Short.MIN_VALUE);


    }
}
