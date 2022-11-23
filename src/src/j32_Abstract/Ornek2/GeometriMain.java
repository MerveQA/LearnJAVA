package src.j32_Abstract.Ornek2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(24, 7);
        dd.setName(" yeni dikdörtgen");
        System.out.println(dd);

        Cember cmbr = new Cember(39);
        cmbr.setName(" yeni çember");
        System.out.println(cmbr);

    }
}
