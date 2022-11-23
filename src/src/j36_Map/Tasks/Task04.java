package src.j36_Map.Tasks;

import java.util.Arrays;
import java.util.HashMap;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */
    public static void main(String[] args) {

        String str= "bir berber bir berber e gel beraber bir berber dukkani acalim demis. berber bak bak demis. ";
        String arr []=str.replace(". "," ").split(" ");

        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer> hm=new HashMap<>();

        for (String w:arr) {
            if (!hm.containsKey(w)){
                hm.put(w,1);

            }else {
                hm.put(w,hm.get(w)+1);
            }
        }
        System.out.println("hm = " + hm);
    }


}
