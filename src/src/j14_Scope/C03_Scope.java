package src.j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {


        C01_InstanceVariable kus=new C01_InstanceVariable(); // istedigim classtan obje create edttik

        kus.name="Huma";
        kus.developerMi=false;

        System.out.println("kus.name = " + kus.name); // Huma
        C01_InstanceVariable.staticMethod(); // class name ile static method call ettik
        kus.nonStaticMethod();// obj ile non Static method call edildi


    }
}
