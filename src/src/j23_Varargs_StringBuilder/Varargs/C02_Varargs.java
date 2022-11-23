package src.j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */

        int arr[]={24,42,33,19,34,45,58,38};

        //TASK1: verilen aray elemanlari toplami print eden method print ediniz.
        System.out.println("arr Toplam: "+arrTopla(arr));

        //TRICK: varargs method parametreleri array gibi tanimladigi icin varargs methoda parametre olarak arrya`de verilebilir

        //TASK2: task1`i varargs ile calisiniz
        System.out.println("varargs toplam: "+varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));
        System.out.println("varargs arr toplam: "+varargsTopla(arr));

    }

    public static int arrTopla(int[] a){ //TASK1
        int toplam=0;
        for (int w:a) {
            toplam+=w;
        }
        return toplam;
    }

    public static int varargsTopla (int ...b){
        int toplam=0;
        for (int x:b) {
            toplam+=x;
        }
        return toplam;
    }



}