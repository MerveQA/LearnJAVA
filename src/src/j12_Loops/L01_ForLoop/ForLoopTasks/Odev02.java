package src.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */


		Scanner sc=new Scanner(System.in);
		System.out.print("icerisinde rakam olan bir string giriniz: ");
		String str= sc.nextLine();

		String ch ;
		int rakamAdet=0;
		for (int i = 0; i < str.length(); i++) {
			ch=str.substring(i,i+1);

			if (ch.equals("9") || ch.equals("8")|| ch.equals("7")|| ch.equals("6")|| ch.equals("5")||
					ch.equals("4")|| ch.equals("3")|| ch.equals("2")|| ch.equals("1")|| ch.equals("0")){

				rakamAdet++;
			}


		}
		System.out.println("Girilen Stringte: "+rakamAdet+" adet rakam vardir");
	}
}
