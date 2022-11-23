package src.j33_Interface;

public class Sahin extends Tofas implements DisDonanim,IcDonanim,Lastik{  // Concrete child class -> Tofas, implement DisDonanim, IcDonanim, Lastik
    @Override
    public void kapi() {
        System.out.println("4 kapi sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("akordion kaporta ");
    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk");
    }

    @Override
    public void klima() {
        System.out.println("ac cami serinle klimasi ");
    }

    @Override
    public void ebat() {

        System.out.println("16 inc Lastik ebat");
    }

    @Override
    public void jant() {

        System.out.println("Agam senin gibi adama celik jant yakisir");
    }

    @Override
    public void motor() {

        System.out.println("1.6 aile motor");
    }

    @Override
    public void yakit() {

        System.out.println("Tuplu araba");
    }

}
