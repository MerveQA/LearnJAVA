package src.j24_AccessModifier.farkliPackage;

import src.j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {
    private String privateteamLead="Hakan Bey";
    String defauldName="Cebrail Bey";
    protected String protectedName= "Dilek Hanim";
    public String publicName= "Gamze Hanim";

    public static void main(String[] args) {

        C01_AccessModifier obj9 =new C01_AccessModifier(23,63); // public cons.
        System.out.println("obj9.publicYas = " + obj9.publicYas); // public variable
        // obj9.defauldYas // defauld variable package disi erisilemez.
        //obj9.protectedMethod () //  protectedMethod package disi call edilemez.


    }
}
