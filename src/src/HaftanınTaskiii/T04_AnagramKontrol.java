package src.HaftanınTaskiii;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

	public static void main(String[] args) {
		/*
		Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.

		Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz

		isAnagram("listen", "Silent") ==> true
		 */


		Scanner scan = new Scanner(System.in);
		System.out.print(" Anagram kontrolu yapilacak kelimeleri giriniz : ");
		String kelime1 = scan.nextLine().toLowerCase();
		String kelime2 = scan.nextLine().toLowerCase();

		// String arr1 [] = new String [kelime1.length()];

		String arr1 [] = kelime1.split("");
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("1 array : "+Arrays.toString(arr1));
		String arr2 [] = kelime2.split("");
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("2. array : "+Arrays.toString(arr2));
		System.out.println("Anagram mi? : "+Arrays.equals(arr1, arr2));



	}






}
