package src.j05_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {
    public static void main(String[] args) {

        //    =         x = 8      x = 8
        //    +=       x += 3     x = x + 3
        //    -=       x -= 3     x = x - 3
        //    *=       x *= 3     x = x * 3
        //    /=       x /= 3     x = x / 3
        //    %=       x %= 3     x = x % 3

        int yas= 33;
        System.out.println(yas+5); // 38
        System.out.println("yas: "+yas); // 33 -> atama (=)olmadigi icin

        System.out.println( yas += 11); // 44 ->  atama oldugu icin
        System.out.println(yas); // 44

    }
}
