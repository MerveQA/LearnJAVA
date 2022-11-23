package src.j32_Abstract.Abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("Crv 2.4 super turbo motor");
    }

    @Override
    void koltuk() {
        System.out.println(" Crv alttan isitmali deri koltuk");
    }

    @Override
    void kapi() {
        System.out.println("Crv Kapi");
    }
}
