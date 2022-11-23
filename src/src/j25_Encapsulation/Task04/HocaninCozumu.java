package src.j25_Encapsulation.Task04;

import java.util.Scanner;

public class HocaninCozumu {//Main ->Ana class

    /*
        Burada iki adet class vardır. Biri Main, diğeri ise student ,
        student classı içinde;
        String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

        Main classın içinde;
        girilen değerleri aşagıdaki gibi print eden code create ediniz
        Örnek:
        age 12'dir.
        name Steven'dır.

        name(isim) olarak;
        "Student name is Steven"
        ve
        age(yaş) olarak da;
        "He is 12 years old"


     */
    public void main(String[] args) {
        // girilen değerleri...
        Scanner sc = new Scanner(System.in);
        System.out.print("agam adını giresen : ");
        String ad = sc.nextLine();
        System.out.print("agam yasını giresen : ");
        int yas = sc.nextInt();
        Student1 s1 = new Student1(ad, yas);//ad ve yas data p'li cons parametre olarak göderildi s1 obj tanımlandı
        System.out.println("student name is " + s1.getName() + "\nHe is " + s1.getAge() + " years old");


    }//main method sonu

}

class Student1 {//Student Class-> inner Class
    // String nameve int age  variables encapsulated ediniz.
    private String name;
    private int age;

    public Student1(String name, int age) {//full p cons.
        this.name = name;
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
