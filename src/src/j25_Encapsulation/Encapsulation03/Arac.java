package src.j25_Encapsulation.Encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
       olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac() {
    }

    public Arac(String model, String renk, int motor, int yil) { // full parametreli telescopic cons.
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor); // set method call edildi.
        //this.yil = yil;
        setYil(yil); // set method call edildi.
        /*
        burada objeden girilen yil ve motor degerleri fields`lara Constructor`daki this. ile gonderilmeden
        once methol call ile setMethoda gonderildi ve methodda sartlara uygun olup olmadigi if sarti ile kontrol
        edildi, Sartlara uygun degilse methodda duzenlenip this. ile fields`lara oradan gonderildi.
         */
    }

    public String getModel() { // parametresiz cons.
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            this.motor = 1001;
            System.out.println("motor hacmi 1000 cc ve altı gecerli degildir");
        }else {
            this.motor = motor;
        }

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil = yil*-1;
            System.out.println("Eksi yil degeri girilemez");
        }else {
            this.yil = yil;
        }

    }

    @Override
    public String toString() {
        return  "< model= " + model +
                ", renk= " + renk +
                ", motor= " + motor +
                ", yil= " + yil+" >";
    }
}
