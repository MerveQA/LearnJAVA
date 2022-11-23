package src.HalukHocaProjeCozum.P04_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class urunListele {
    public static void urunListele() {
        System.out.printf("%-9s %-10s %-10s %-10s %-10s %-10s\n", "ID", " Ürün", " Üretici", "Miktar", "Cuval", "Raf");
        System.out.println("====================================================================================");
        Set<Integer> keySets = Variables.urunlerMap.keySet();
        Collection<List> valueSet = Variables.urunlerMap.values();
        for (Integer each : keySets) {
            List<Urun> valuesList = new ArrayList<>();
            valuesList = Variables.urunlerMap.get(each);
            int index = 0;
            while (index < valuesList.size()) {
                System.out.printf("%-9s %-10s %-10s %-10d %-10s %-10s\n", each, valuesList.get(index).getUrunIsmi(), valuesList.get(index).getUretici(),
                        valuesList.get(index).getMiktar(), valuesList.get(index).getBirim(), valuesList.get(index).getRaf());
                index++;
            }
        }
    }
}
