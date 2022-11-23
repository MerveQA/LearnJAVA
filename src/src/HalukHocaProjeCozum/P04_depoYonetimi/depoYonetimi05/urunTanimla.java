package src.HalukHocaProjeCozum.P04_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.List;

public class urunTanimla {
    public static void urunTanimla() {
        while (true) {
            System.out.println("Bitirmek için X'e basiniz. ");
            System.out.println("Urun bilgileri giriniz : ");
            int urunID = Variables.rnd.nextInt(1000);
            String urunIsmi = "";
            try {
                System.out.print("Urun ismi :");
                urunIsmi = Variables.scan.next();
                if (urunIsmi.equalsIgnoreCase("X")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Variables.scan.nextLine();//dummy
            System.out.print("Uretici Firma : ");
            String ureticiFirma = Variables.scan.nextLine();
            Urun yeniUrun = new Urun(urunID, urunIsmi, ureticiFirma);
            List<Urun> urunTanimlaList = new ArrayList<>();
            urunTanimlaList.add(yeniUrun);
            Variables.urunlerMap.put(yeniUrun.getId(), urunTanimlaList);
        }
        urunListele.urunListele();
    }
}
