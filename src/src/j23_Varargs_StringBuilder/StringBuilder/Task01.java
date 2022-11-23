package src.j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {

        /*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Method create ediniz.
        (without case sensitivity)
        Eg : input : I love Java
        Output: "Reversed sentence : avaJ evol I
        It is not a palindrome"
        */

        System.out.println("tersString(\"ece\") = " + tersString("ece")); // ece
        System.out.println("tersString(\"serhat\") = " + tersString("serhat")); // tahres

        StringBuilder sb1= new StringBuilder("Ali");
        tersSB(sb1); // ilA
        tersSB(new StringBuilder("Serhat")); // tahreS

        System.out.println("isPalindrom(\"ey edip adanada pide ye\") = " + isPalindrom("ey edip adanada pide ye")); //true
        System.out.println("isPalindrom(\"aga\") = " + isPalindrom("aga"));//true
        System.out.println("isPalindrom(\"nazım\") = " + isPalindrom("nazım"));//false
    }
    public static String tersString(String str){ // amele code
        String tersString="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersString+=str.charAt(i);
        }

        return tersString;
    }

    public static void tersSB(StringBuilder sb){ // cincik code

        System.out.println("sb.reverse() = " + sb.reverse());
    }

    public static boolean isPalindrom(String str){
       if (str==null){
           return false;
       }

        return new StringBuilder(str).reverse().toString().equals(str);
    }


}
