package src.j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher ogrt1 = new C04_Teacher(); // ogrt1 obje kreate edildi
        ogrt1.ad="muharrem";
        ogrt1.soyad="Guzel";
        ogrt1.brans="Qa";
        ogrt1.emekliMi=false;
        ogrt1.maas=23000;
        ogrt1.tecrube= 11;

        ogrt1.derSaati(); //Haftada 20 saatten fazlasi ekstradir

        System.out.println("ogrt1 = " + ogrt1);
       /*
       ogrt1 = C04_Teacher;
        ad= muharrem
        soyad= Guzel
        brans= Qa
        tecrube= 11
        maas= 23000.0
        id= 0
        emekliMi= false
        */

        C04_Teacher ogrt2 = new C04_Teacher("Ugur","javacan","dev"
                                           ,15,100000,333,false);

        System.out.println("ogrt2 = " + ogrt2);
        /*
        ogrt2 = C04_Teacher;
        ad= Ugur
        soyad= javacan
        brans= dev
        tecrube= 15
        maas= 100000.0
        id= 333
        emekliMi= false
         */
    }
}
