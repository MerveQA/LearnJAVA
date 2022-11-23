package src.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

        /*
        Oluşturulan double'lar hakkında (num1, num2)
        birbirine eşit olup olmadıklarını doğrulayın.
        Eğer eşitlerse konsolda true yazacaktır.
        */

        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        System.out.println("Kullanicinin girdigi num1= "+num1+", num2= "+num2+"`e esit mi? -> "+(num1==num2));

        // num1= 15, num2= 15 girilirse => // Kullanicinin girdigi num1= 15.0, num2= 15.0`e esit mi? -> true
        // num1= 15, num2= 55 girilirse => // Kullanicinin girdigi num1= 15.0, num2= 55.0`e esit mi? -> false

    }
}
