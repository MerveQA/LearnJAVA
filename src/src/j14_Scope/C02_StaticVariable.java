package src.j14_Scope;

public class C02_StaticVariable {

    /*
    instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

    Static variabler ise class variable olarak tanimlanir
    ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
    eger static variable'in degeri degistirilirse herkes icin degisir
    */

    static String firmaName= "clarusway";
    static int firmaId;
    static boolean firmaIt;

    public static void main(String[] args) {
        System.out.println("firmaId = " + firmaId); // 0
        firmaId=1001; // static variable name ile call -> best practice
        System.out.println("firmaId = " + firmaId); // 1001
        C02_StaticVariable.firmaIt=true; // classname ile static variable call -> bad practice

        staticMethod(); // static method static maine call edildi.
        // nonStaticMethod(); // static olmadigi icin direkt ismiyle call edilemez





    }

    public static void  staticMethod(){
        firmaId=2002; // static vartiable call
        System.out.println("firmaId = " + firmaId);
    }

    public void nonStaticMethod(){
        firmaName="javaCAN";
        System.out.println("firmaName = " + firmaName);


    }


}
