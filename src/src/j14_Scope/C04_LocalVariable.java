package src.j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {

        int yas=33;
        System.out.println("yas = " + yas);

        for (int i = 0; i < 7; i++) { // for basi
            System.out.println(yas+" "); // yas local variable ayni locale call edildi
            i++;// i loop variable loop call edildi
        } // for sonu
        // i=34; // locale disi call edilemez

        yas=35; // local variable localinde call edildi.



    } // main sonu

    //yas=48; // locale disi call edilemez
}
