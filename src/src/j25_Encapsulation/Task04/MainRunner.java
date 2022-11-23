package src.j25_Encapsulation.Task04;

import java.util.Scanner;

public class MainRunner {
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

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("adinizi girin: ");
        String ad= scan.nextLine();
        System.out.print("yasinizi girin: ");
        int yas=scan.nextInt();

        Student1 obj1= new Student1(ad,yas); // ad ve yas, parametre olarak constructora gonderildi

        System.out.println("Student name is: "+obj1.getName()+"\nHe is"+obj1.getAge()+" years old");
    }
}
