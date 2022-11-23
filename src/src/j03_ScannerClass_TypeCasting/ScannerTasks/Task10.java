package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

    // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazınız.
    // formula: c = (f-32)*5/9

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen Santigrat`a cevirmek istediginiz Fahrenhayt sicakligini giriniz: ");
        int fahrDer = scan.nextInt();

        double celsius= (fahrDer-32)*5/9;

        System.out.println("Girdiginiz "+fahrDer+" Fahrenhayt "+celsius+" Santigrattir");



    }
}
