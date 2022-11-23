package src.j10_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {

        /*
        TASK :
        Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 1.YOL:
        System.out.println(""+(harfDepo.charAt(harfDepo.indexOf("E"))) + (harfDepo.charAt(harfDepo.indexOf("M"))) +
                (harfDepo.charAt(harfDepo.indexOf("R"))) + (harfDepo.charAt(harfDepo.indexOf("E"))));

        //2. YOL
        char e=harfDepo.charAt(harfDepo.indexOf("E"));
        char m=harfDepo.charAt(harfDepo.indexOf("M"));
        char r=harfDepo.charAt(harfDepo.indexOf("R"));

        System.out.println(e+m+r+e);// asciii->toplama-> 297
        System.out.println(""+e+m+r+e);// string->concat-> EMRE


    }
}
