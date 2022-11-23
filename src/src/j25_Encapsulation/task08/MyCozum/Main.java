package src.j25_Encapsulation.task08.MyCozum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Kitap ismi giriniz: ");
        String kitapAdi= sc.nextLine();
        System.out.print("Kitabin yazarini giriniz: ");
        String yazar= sc.nextLine();

        Book obj =new Book();
        obj.setBookName(kitapAdi);
        obj.setAuthorName(yazar);

        System.out.println(obj.getBookName()+" isimli kitabin yazari: "+obj.getAuthorName());

    }


} // main class sonu

class Book { // book Class baslangici

    // fields
    private String bookName;
    private String authorName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
} // book Class sonu
