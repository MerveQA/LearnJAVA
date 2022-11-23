package src.j32_Abstract.Abstract01;

public abstract class Honda { // Parent Abstract Class

    public abstract void motor();

    void sunrooff(){
        System.out.println("Honda sunrooff extra ucrete tabi");
    }

    abstract void koltuk();

    abstract void kapi();

    // Abstract classta variable tanimlanabilir mi -> Evet
    String name= "Gulsum Team Lead";

    //Variablelar Abstract olur mu? -> Kesinlikle hayir.
    //public abstract int yas =48; -> olmaz

    //final void finalMethod (); -> concrete method bodysiz olamaz
    //final abstract void finalMethod (); -> Abstract method

    //private void privateMethod (); -> concerete method body'siz olamaz
    //private abstract void privateMethod (); -> abs method private olamaz

    //static void gunesMethod(); -> concerete method body'siz olamaz
    //static abstract void gunesMethod(); -> abs method static olamaz

    //Honda obj = new Honda(); -> melekler doğurmaz abs class obj uretmez...

}
