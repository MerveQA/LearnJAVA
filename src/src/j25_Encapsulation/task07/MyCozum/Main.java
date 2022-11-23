package src.j25_Encapsulation.task07.MyCozum;

import java.util.Scanner;

public class Main {// main class baslangici

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Isminiz:");

        String ad= sc.nextLine();

        System.out.print("*** Clarusway Emlak Ofisine Hosgeldiniz ***\n" +
                "Kac odali Daire Istersiniz\n" +
                "0 odali icin -> 0\n" +
                "1 odali icin -> 1\n" +
                "2 odali icin -> 2\n" +
                "3 odali icin -> 3\n" +
                "Tuslayiniz: ");
        int odaSayisi = sc.nextInt();

        System.out.println("Daireniz Balkonlu mu Olsun? -> true/false ");
        boolean balkonOlsunMu = sc.nextBoolean();

        RentApartments kiraci1 = new RentApartments();
        kiraci1.setName(ad);
        kiraci1.setRoomCount(odaSayisi);
        kiraci1.setBalconyOrNo(balkonOlsunMu);

        System.out.println(kiraci1.getName()+" kira Bedeli: $"+(kiraci1.odaSayisi()+kiraci1.balkon()));
    }

} // main class sonu

                     // **** 2. CLASS BASLANGICI ****

class RentApartments { // rentApartments class baslangici

    // fields
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    private int rent;
    public int odaSayisi() {

        switch (roomCount) {
            case 0: rent = 1400; break;
            case 1: rent = 1700; break;
            case 2: rent = 2200; break;
            case 3: rent = 2700; break;
            default:
                System.out.println("Hatali oda sayisi sectiniz. Tekrar Deneyiniz.");
                odaSayisi();
        }
        return rent;
    }

    public int balkon (){
        int blkn =0;
        if (balconyOrNo) {
            blkn+=200;
        }
        return blkn;
    }

}// rentApartments class sonu
