package src.j32_Abstract.Ornek3.DersteCozuldu;

public abstract class SaladClass extends FootClass {

    public abstract void madeIn(); // parent ve child abstract classlarda ayni isimli 2 method tanimlanabilir.

    @Override
    public void taste() {

        System.out.println("Gavurdagi coban salata, sogusmu verelim");
    }
}
