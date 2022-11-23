package src.j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_ImmutableClass {
    public static void main(String[] args) {

        /*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
        */

        String name= "Merve";
        System.out.println("concat oncesi: "+name);

        name.concat("javacan");
        System.out.println("concat sonrasi: "+name); // merve -> String name variable method sonrasi ayni kaldi => Immutable

        List<String > isimList =new ArrayList<>();
        System.out.println(isimList); // []

        isimList.add("fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        System.out.println(isimList); // [fatih, erkan, serhat]

        isimList.remove(1);
        isimList.set(1,"javacan");
        System.out.println(isimList); // [fatih, javacan] list bosken methodlar sonrasi degisti => Mutable




    }
}
