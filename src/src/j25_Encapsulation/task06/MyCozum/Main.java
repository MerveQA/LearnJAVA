package src.j25_Encapsulation.task06.MyCozum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Adinizi Girin:");

        String ad= sc.nextLine();
        System.out.print("Uye olmak istermisiniz -> true/false : ");
        boolean abone =sc.nextBoolean();


        Subscribe uye1 =new Subscribe();
        uye1.setName(ad);


        uye1.setDoYouWanaSubscribe(abone);

        if (abone){
            System.out.println("Welcome to membership "+ uye1.getName());
            System.out.println("Hangi uyeligi secmek istersiniz?\n" +
                    "Gold\n" +
                    "Silver\n" +
                    "Bronze");
            String uyelik =sc.next().toLowerCase();
            uye1.setWhichMember(uyelik);
            System.out.println(uye1.memberShip(uye1.getWhichMember()));
        }else {
            System.out.println("See you when you want to be a member. Thanks");
        }





    }
}
