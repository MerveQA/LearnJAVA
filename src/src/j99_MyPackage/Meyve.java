package src.j99_MyPackage;

public class Meyve{

    public Meyve() {

        System.out.println("“Meyve constructor”");

    }

}

class Karpuz extends Meyve{

    public Karpuz () {

        System.out.println("“Karpuz constructor”");

    }

    public static void main(String args[]){

        Karpuz karpuz= new Karpuz ();

    }

}
