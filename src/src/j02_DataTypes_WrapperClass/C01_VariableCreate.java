package src.j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        // 1.Yol: best practice(Recomended) tavsiye edilen
        int yas= 48;
        int maas= 33000;
        System.out.println(yas); // 48
        System.out.println("yas"); // yas
        System.out.println(maas); // 33000
        System.out.println("baslangic maasi: " +maas); // baslangic maasi: 33000

        //2.Yol:
        int boy; // degeri atanmadan boy isminde bir int tanimlandi declaration
        // System.out.println(boy); // degeri atanmamis degiskeni hic bir aksiyonda kullanilmaz CTE
        boy= 175;
        System.out.println("Boyunuz: " +boy); // 175

        //3. Yol:
        int yevmiye, age, kilo; // birden cok ayni tipte degisken tanimladik
        age= 33;
        yevmiye= 1000;
        kilo= 99; // tanimlanan degiskenlere deger atamasi yapildi

        int gunluk=1500, yil=2022, agirlik=99;
        //TRICK: bir variable sadece bir kez tanimlanabilir birden cok deger atanabilir.
        System.out.println(gunluk);// 1500

        gunluk=1800;// gunluk yeni degeri atandi
        System.out.println("gunluk son degeri: "+gunluk);// 1800
        System.out.println("Gunluk deger: "+gunluk+" Yil: "+yil+" Yas: "+yas+" Yevmiye: "+yevmiye);


    }


}
