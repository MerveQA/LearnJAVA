package src.j06_Comparison_Karsilastirma_Operators.tasks;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*
        İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
        Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
        Sonucu yazdırınız.
        */

        //Kodu aşağıya yazınız.

        float f1= 14f;
        float f2= 17f;

        System.out.println("f1 f2`den buyuk veya esit mi? -> "+(f1>=f2)); // f1 f2`den buyuk veya esit mi? -> false
        System.out.println("f1 f2`den kucuk veya esit mi? -> "+(f1<=f2)); // f1 f2`den kucuk veya esit mi? -> true
        System.out.println("f1 f2`den buyuk mu? -> "+(f1>f2)); // f1 f2`den buyuk mu? -> false
        System.out.println("f1 f2`den kucuk mu? -> "+(f1<f2)); // f1 f2`den kucuk mu? -> true


    }
}
