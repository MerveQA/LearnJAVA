package src.j32_Abstract.Abstract01;

public class Civic extends Lastik { // Honda parent abstract Class. extend child concrete class
    /*
    Extends Honda yazilarak Honda Classa concrete bir Civic class tanimlandi.
    Java CTE verdi
    Cozum:
    1- Uniplemented (uyarlanmamis) method implement edilmeli.
    2- Parent Honda classdan abstract keyword kaldirilmali
    3- Concrete olan child Civic class abstract tanimlanmali
     */

    // Concerete classda abstract method tanimlanir mi?
    //public abstract void absMethod(); // ya method abstract olmali yada method concrete body olmali.
    // TRICK: child concrete class abs classin abs methodlarini mutlaka implement override etmeli

    @Override //impelement edilen abs method
    public void motor() {

        System.out.println("Civic 1.6 eco motor az yakar cok kacar");
    }

    @Override //impelement edilen abs method
    void koltuk() {

        System.out.println("Civicde Kumas koltuk kullanin");
    }

    @Override //impelement edilen abs method
    void kapi() {

        System.out.println("Civic 4 kapi sedan");
    }

    @Override
    public void lastikEbati() {

        System.out.println("Civic 21 inc lastik ");
    }
    public int vites (){ // concrete child class

        return 5;
    }



    //Honda obj = new Civic(); // honda oglu civic
    //Civic obj1 = new Civic(); // civic oglu civic

}
