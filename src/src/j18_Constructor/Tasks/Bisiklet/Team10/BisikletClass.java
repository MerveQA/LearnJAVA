package src.j18_Constructor.Tasks.Bisiklet.Team10;

public class BisikletClass {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites  // done
     method  :hizdegistir(), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster() -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */

    // fields ---> instance variables
    int hiz;
    int vites;

    // p.li cons.
    public BisikletClass(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "BisikletClass{" +
                "hiz=" + hiz +
                ", vites=" + vites +
                '}';
    }

    public void hizdegistir(int yeniHiz) {

        hiz = yeniHiz;
        System.out.println("yeni hiziniz : " + hiz);
    }

    public void vitesArtir() {
        vites++;
        if(vites>5){
            System.out.println("vitesiniz 5 den buyuk degerde olamaz");
            vites--;
        }

        System.out.println("yeni vites : "+vites);
    }

    public void vitesAzalt() {
        vites--;
        if(vites<1){
            System.out.println("vitesiniz 0 den kucuk degerde olamaz");
            vites++;
        }

        System.out.println("yeni vites : "+vites);
    }

    public void durumGoster() {
            System.out.println("Anlik hiz = " + hiz);
            System.out.println("Anlik vites = " + vites);
        }
    }

