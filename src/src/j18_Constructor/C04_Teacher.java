package src.j18_Constructor;

public class C04_Teacher { // ogretmen obje ureten kaliphane classi

    String ad;
    String soyad;
    String brans;
    int tecrube;
    double maas;
    int id;
     boolean emekliMi;

    public void derSaati() {
        System.out.println("Haftada 20 saatten fazlasi ekstradir");
    }

    public C04_Teacher() {// parametrelinin ezdigi defauld constructor yerine parametresiz constructor create ettik.
    }

    //TRICK: parametreli constructor defauld constructor`u ezer
    // Sag tik -> Generate -> Constructor
    public C04_Teacher(String ad, String soyad, String brans, int tecrube, double maas, int id, boolean emekliMi) {// parametreli constructor
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.id = id;
        this.emekliMi = emekliMi;
    }

    @Override
    public String toString() {
        return "C04_Teacher;" +
                "\nad= " + ad +
                "\nsoyad= " + soyad +
                "\nbrans= " + brans +
                "\ntecrube= " + tecrube +
                "\nmaas= " + maas +
                "\nid= " + id +
                "\nemekliMi= " + emekliMi;
    }
}
