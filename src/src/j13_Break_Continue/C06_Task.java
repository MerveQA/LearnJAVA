package src.j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        //TASK: Girilen bir ifadedeki c karakterine kadar a karakter sayisini print eden code yaziniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Cumle giriniz: ");
        String cumle= sc.nextLine();

        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {

            char ch = cumle.charAt(i);

            if (ch == 'c') {
                break;
            } else if (ch=='a') {
                sayac++;
            }
        }
        System.out.println("c karakterine kadar "+sayac+" adet a karakteri var");

    }
}
