package src.j15_Arrays.ArraysEasyTasks;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        String str []= {"Apple" , "Orange" , "Banana" , "Pineapple"};

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals("Apple")){
                System.out.println(true);
                break;
            } else{
                System.out.println(false);
                break;
            }

        }



    }
}
