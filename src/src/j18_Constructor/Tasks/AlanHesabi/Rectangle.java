package src.j18_Constructor.Tasks.AlanHesabi;

public class Rectangle {

    int width;
    int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public  int cevreHesapla(){

      return (width+length)*2;
    }

    public  int alanHesapla(){

        return width*length;
    }
}
