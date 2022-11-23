package src.j23_Varargs_StringBuilder.Varargs;

public class task03 {
    public static void main(String[] args) {

        /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
        */

        int sayi=5;

        String str1="muharrem";
        String str2="ali";
        String str3="ebikGabik";

        carpStringTopla(sayi,str1,str2,str3,"JavaCan");

    }

    public static void carpStringTopla(int a, String ...str){
        String enUzun="";

        for (String w:str) {
            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
        System.out.println(a*(enUzun.length())+" "+enUzun);

    }
}
