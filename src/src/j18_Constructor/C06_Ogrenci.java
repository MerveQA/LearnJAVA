package src.j18_Constructor;

public class C06_Ogrenci { // Kaliphane

    // Fields
    String isim="Merve Hanim";
    int yas;
    String name;
    int age;


    public C06_Ogrenci(String isim, int yas) { // 2 parametreli Constructor
        //this.isim = isim; // parametre isim degeri instance obj isim degerine atandi
        //this.yas = yas; // parametre yas degeri instance obj yas degerine atandi

        isim=isim; // parametre isim yine parametre isme atandi instance obj isim degeri degismedi
        yas=yas; // parametre yas yine parametre yasa atandi instance obj yas degeri degismedi

        //name=isim; // parametre isim degeri instance obj name degerine atandi
        //age=yas; // parametre yas degeri instance obj age degerine atandi

        System.out.println("Constructordaki isim: "+isim); // parametre isim degeri: Saliha Hanim
        System.out.println("Constructordaki isim: "+this.isim); // instance obj isim degeri: Merve Hanim
        System.out.println("Constructordaki name: "+name); // instance obj name degeri: null
    }
}
