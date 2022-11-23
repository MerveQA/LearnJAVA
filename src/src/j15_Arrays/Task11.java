package src.j15_Arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
/*
		 /*
		TASK :
		$ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arrStr []=str.split(" ");

        System.out.println(Arrays.toString(arrStr));

        int dolarToplam =0;
        int sterlinToplam=0;



        for (int i = 0; i <arrStr.length ; i++) {
            if (arrStr[i].contains("$")) {

                dolarToplam+= Integer.parseInt(arrStr[i].replace("$", ""));
            }else{
                sterlinToplam+= Integer.parseInt(arrStr[i].replace("£", ""));

            }
        }

        System.out.println("toplam Dolar: $"+dolarToplam);
        System.out.println("toplam Dolar: £"+sterlinToplam);


    }
}
