package src.j32_Abstract.Abstract01;

public class Accord extends Honda {
    @Override
    public void motor() { // implement edilen abstract method
        System.out.println("Accord 2.0 motorludur");
    }

    @Override
    void koltuk() { // implement edilen abstract method
        System.out.println("Accord deri koltukludur");
    }

    @Override
    void kapi() { // implement edilen abstract method

        System.out.println("Accord 2 kapili olur mu");
    }

    @Override
    void sunrooff() { // override edilen method

        System.out.println("Accord`da sunrooff mutlaka olmali");
    }
}
