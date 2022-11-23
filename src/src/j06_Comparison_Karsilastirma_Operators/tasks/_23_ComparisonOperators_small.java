package src.j06_Comparison_Karsilastirma_Operators.tasks;

public class _23_ComparisonOperators_small {

    public static void main(String[] args) {

        /*
        2 double oluşturun.
        İkisinin de değeri 14.23 olsun.
        Double1'in double2 'den küçük olup olmadığını doğrulayın.(Eğer küçükse konsolda 'true' yazacaktır.)
        Cevabı yazdırın.
        */

        //  Kodu aşağıya yazınız.

        double db1= 14.23;
        double db2= 14.23;

        System.out.println("Double1 double2`den kucuk mu? -> "+(db1<db2)); // Double1 double2`den kucuk mu? -> false
        System.out.println("Double1 double2`den kucuk degil mi? -> "+!(db1<db2)); // Double1 double2`den kucuk degil mi? -> true



    }
}
