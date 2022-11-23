package src.j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While Loop: once sart kontrol edilir, sart True ise body calisir.
        do-While Loop: once loop body 1 defa calisir sonra sart kontrol edilir, sart true ise dongu devam eder,
                       false ise dongu kirilir ve donguden sonraki satirlardan devam eder.
        do-While Loop daha cok game app.de kullanilir

        TRICK: While Loop sart saglamazsa hic calismaz. do-While Loop sart sağalasın yada  sağlamasın
               en az bir kez çalışır..
         */

        int yas =31;

        while (yas<33){
            System.out.println("agam yasin: "+yas+" While body action....");
            yas++;
        }



        do {
            System.out.println("agam yasin: "+yas+" do-While body action....");
            yas++;
        }while (yas<33);

        System.out.println("do-While sonrasi satir");



    }
}
