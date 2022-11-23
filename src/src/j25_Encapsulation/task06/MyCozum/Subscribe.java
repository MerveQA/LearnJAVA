package src.j25_Encapsulation.task06.MyCozum;

public class Subscribe {

    //fields
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }

    public String memberShip(String whichMember) {


        switch (whichMember) {
            case "gold":
                System.out.println("Your membership is 40 dollar for month you can enjoy the videos, all homework and see you soon.");
                break;
            case "silver":
                System.out.println("Your membership is 20 dollar for month you can enjoy the videos and all homework.");
                break;
            case "bronze":
                System.out.println("Your membership is 10 dollar for month you can enjoy the videos.");
            default:
                System.out.println("Hatali Giris. Tekrar Deneyin");

        }


        return "";
    }
}
