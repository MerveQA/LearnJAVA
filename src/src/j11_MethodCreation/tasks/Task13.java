package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen birinci kelimeyi girin: ");
        String kelime1 = sc.nextLine();
        System.out.print("Lutfen ikinci kelimeyi girin: ");
        String kelime2 = sc.nextLine();

        kontrolEt(kelime1,kelime2);
    }

    public static void kontrolEt(String kelime1, String kelime2) {
        System.out.println(kelime1.endsWith(kelime2));

    }

}
