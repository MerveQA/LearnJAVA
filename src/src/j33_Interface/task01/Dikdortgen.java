package src.j33_Interface.task01;

public class Dikdortgen implements Sekil{
    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){
            return boyut[0]*4; // varargs`a girilen parametre 1 tane ise kare alani hesapla
        }else // varargs`a girilen parametre 1 tane degilse dikdortgen cevre hesapla
        return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {

        if (boyut.length==1){
            return boyut[0]*boyut[0]; // varargs`a girilen parametre 1 tane ise kare alani hesapla
        }else //// varargs`a girilen parametre 1 tane degilse dikdortgen alani hesapla
            return boyut[0]*boyut[1];
    }
}
