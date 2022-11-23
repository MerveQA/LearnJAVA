package src.j15_Arrays.ArraysEasyTasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayiArr[]={ 5,6,8,12,14,19};

        int toplam=0;

        for (int i = 0; i < sayiArr.length; i++) {

            if (sayiArr[i]%2==0){
                toplam+=sayiArr[i]; // +6+8+12+14  =40
            }else {
                toplam-=sayiArr[i]; // -5 -19 = -24
            }
        }

        // toplam -5 +6 +8 +12 +14 -19 =16

        System.out.println("toplam= " + toplam); // 16


    }
}
