package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {
    public static void main(String[] args) {
        /*
       TASK :
      Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
      Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
      Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
      Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.

      1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
      2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
      3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
      4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
      5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
      			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
      			 ortalama kazançtan yüksekse o günleri return yap.
      6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
      			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
      			 ortalama kazançtan aşağıysa o günleri return yap.
     */

        Scanner scan= new Scanner(System.in);
        List<String> gunler= new ArrayList<>(List.of("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
        List<Integer> gunlukKazanclar=new ArrayList<>();

        int sayac=0;
        int haftaCirosu=0;
        while (sayac<7){
            System.out.print(gunler.subList(sayac,sayac+1)+" gunku kazancinizi giriniz: ");
            int gunKazanci=scan.nextInt();
            gunlukKazanclar.add(gunKazanci);
            sayac++;
            haftaCirosu+=gunKazanci;
        }

        System.out.println("\nBakkalin gunluk kazanclari: "+gunlukKazanclar);
        System.out.println("Bakkalin haftalik cirosu: "+haftaCirosu+"$");
        System.out.println();//dummy

        getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftalik ortalama kazanc: "+getOrtalamaKazanc(gunlukKazanclar)+"$");
        System.out.println();//dummy
        getOrtalamaninUstundeKazancGünleri(getOrtalamaKazanc(gunlukKazanclar),gunlukKazanclar,gunler);
        System.out.println();//dummy
        getOrtalamaninAltindaKazancGünleri(getOrtalamaKazanc(gunlukKazanclar),gunlukKazanclar,gunler);

    }

    private static void getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc, List<Integer> gunlukKazanclar, List<String> gunler) {
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)<ortalamaKazanc){

                System.out.println(gunler.subList(i,i+1)+" gunu,"+gunlukKazanclar.subList(i,i+1) +"$ kazanc elde edilmistir " +
                        ortalamaKazanc+"$ ortalamanin Altindadir.");
            }
        }
    }

    private static void getOrtalamaninUstundeKazancGünleri(double ortalamaKazanc, List<Integer> gunlukKazanclar,List<String> gunler) {

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)>ortalamaKazanc){

                System.out.println(gunler.subList(i,i+1)+" gunu,"+gunlukKazanclar.subList(i,i+1) +"$ kazanc elde edilmistir " +
                        ortalamaKazanc+"$ ortalamanin Ustundedir");
            }
        }
    }

    private static double getOrtalamaKazanc(List<Integer> gunlukKazanclar) {

        int toplamKazanc = 0;

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplamKazanc += gunlukKazanclar.get(i);
        }
        return toplamKazanc / 7;
    }
}
