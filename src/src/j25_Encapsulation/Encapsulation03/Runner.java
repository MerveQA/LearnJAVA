package src.j25_Encapsulation.Encapsulation03;

public class Runner {
    public static void main(String[] args) {

        // 4. step
        Arac honda =new Arac("Accord","Siyah",-200,2012);
        Arac volvo =new Arac("s80","Beyaz",2000,-2015);

        Arac haciMurat =new Arac();
        haciMurat.setModel("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYil(1974);
        haciMurat.setRenk("cucuk sari");

        System.out.println("Honda: "+honda);
        System.out.println("Haci Murat: "+haciMurat);
        System.out.println("Volvo: "+volvo);

    }
}
