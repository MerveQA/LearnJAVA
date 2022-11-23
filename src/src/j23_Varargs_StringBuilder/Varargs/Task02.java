package src.j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {

        //TASK: Girilen ilk sayi haric digerlerini toplayan ve toplam ile ilk sayiyi carpan method create ediniz.

        topla(10,20,45,20,52,36);

        int arr[]={20,45,20,52,36};
        topla(5,arr);
    }

    public static void topla (int a, int ...b){
        int toplam=0;

        for (int w:b) {
            toplam+=w;
        }
        System.out.println("toplam: "+toplam);
        System.out.println("Carpim: "+a*toplam);
    }


}
