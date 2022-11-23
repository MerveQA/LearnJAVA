package src.j25_Encapsulation.Encapsulation02;

public class Runner {
    public static void main(String[] args) {

        Kisi obj1 = new Kisi("Umit", "K", 33, "umitK33");// obj create edildi

        System.out.println("obj1.ad = " + obj1.ad);
        obj1.ad = "Guzel Insan Umit Bey";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyad = " + obj1.soyad);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-41);
        System.out.println("obj1.getYas() = " + obj1.getYas());

    }
}
