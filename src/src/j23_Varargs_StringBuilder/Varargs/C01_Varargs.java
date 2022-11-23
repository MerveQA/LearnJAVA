package src.j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {

        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName( parametre1,parametre2, dataType... dataName ) {
        meyhod body....

        }

	    1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

        TRICK : Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
                ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki sayi toplamını print eden METHOD create ediniz

        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;

        topla(sayi1,sayi2);
        topla(sayi3,sayi2);
        topla(sayi1,sayi4);

        // Task -> verilen uc sayi toplamını print eden METHOD create ediniz

        topla(sayi1,sayi2,sayi3);

        System.out.println("*** VarargsMethod ***");
        toplaVarargs(sayi1,23,sayi2,sayi3); // 4 parametreli
        toplaVarargs(44,23,62,sayi1,sayi3); // 5 parametreli
        toplaVarargs(sayi2,sayi3); // 2 parametreli

        //TASK: verilen String`lerin en fazla karaktere sahip olani print eden method create ediniz.
        //      parametre sayisi belrli degil oyuzden varargs

        enUzunKelime("aga","zeyyid","musa");
        enUzunKelime("sumeyra","cebrail","ali");

    }

    public static void topla (int a, int b){ // 2 parametreli overload method

        System.out.println("Sayilar Toplami: "+(a+b));
    }

    public static void topla (int a, int b,int c){ // 3 parametreli overload method

        System.out.println("Sayilar Toplami: "+(a+b+c));
    }

    public static void toplaVarargs (int...a ){ // varargs method
        int toplam=0;

        for (int w :a) { // varargs parametre array icinde tanimlandigi icin parametreler loop aksiyonu alir
            toplam+=w;
        }
        System.out.println("Sayilarin Toplami: "+ toplam);

    }

    public static  void  enUzunKelime (String ...str){
        String enUzun="";
        for (String w:str) {
            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
        System.out.println("enUzunKelime: "+enUzun);

    }

}
