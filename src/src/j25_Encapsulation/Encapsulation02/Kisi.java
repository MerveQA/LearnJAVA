package src.j25_Encapsulation.Encapsulation02;

public class Kisi {
    /*
    Kisi pojo class icin fields -> ad, soyad, passwoerd(String), yas
    tum fielde`lari kullanici gorebilmeli ve password haric update edebilmeli
    password encapsulated edilmemeli.
    yas variable negatif deger girmeye karsi encapsulated

    runner class`da obj ile field`lari print eden code create ediniz.
     */

    String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0){
            this.yas=yas*-1;
        }else {
            this.yas=yas;
        }
        //this.yas = Math.abs(yas); // parametre gelen yas -`den kurturularak atandi
    }

    public String getPassword() {
        return password;
    }

}
