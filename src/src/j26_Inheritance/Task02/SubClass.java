package src.j26_Inheritance.Task02;

public class SubClass extends SuperClass {

    public static void main(String[] args) {

        SubClass obj =new SubClass();
        obj.my_method();

    }

    int num= 10;

    public  void my_method (){
        goster(); // subClass call
        super.goster(); // superClass call

        System.out.println("subClass num: "+num);
        System.out.println("superClass num: "+super.num);

    }

    public void goster(){ // SuperClass`tan override edildi.
        System.out.println("Bu method Sub classsın görüntülenme methodudur.");
    }

    //@Override
    //public void goster() {
    //    System.out.println("Bu method Sub classsın görüntülenme methodudur.");
    //}
}
