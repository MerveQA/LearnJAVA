package src.j02_DataTypes_WrapperClass;

public class C05_SwapInterviewQuestion {
    public static void main(String[] args) {
             /*
            TASK :
            Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
            code create edip print ediniz.
            a) 3. bir variable kulanarak
            b) 3. bir variable kullanmadan

             input	: sayi1=20 ve sayi2=34;
             output  :  sayi1=34 ve sayi2=20
             */

        int sayi1=20;
        int sayi2=34;

        // a)
        System.out.println("*** a çözümü ***");
        int sayi3=0;

       // sayi3= sayi1;
       // sayi1= sayi2;
       // sayi2= sayi3;

        System.out.println("sayi1= "+sayi1);
        System.out.println("sayi2= "+sayi2);


        // b)
        System.out.println("*** b çözümü ***");

        sayi1= sayi1+sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;

        System.out.println("sayi1= "+sayi1);
        System.out.println("sayi2= "+sayi2);


    }
}
