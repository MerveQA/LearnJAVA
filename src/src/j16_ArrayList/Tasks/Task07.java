package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {

        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List <String> isimList= new ArrayList<>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

        System.out.println(isimList);

       // String kutu=isimList.get(2); // Kemal bos bir Stringe atandi
       // System.out.println(kutu);

       // isimList.set(2,isimList.get(7)); // Kemalin yerine Furkan atandi ve Kemal silindi

       // isimList.set(7,kutu); // Furkanin yerinede Stringe atanan Kemal atandi
       // System.out.println(isimList);


        //2. YOL:
        Collections.swap(isimList,2,7);

        System.out.println(isimList);







    }
}
