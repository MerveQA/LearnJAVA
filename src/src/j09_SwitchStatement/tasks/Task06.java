package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

		Scanner scan = new Scanner(System.in);
		System.out.print("VIP kisaltmasindaki harflerden birini girin : ");
		String input= scan.nextLine().toUpperCase();

		switch (input){
			case "V":
				System.out.println("Very");
				break;
			case "I":
				System.out.println("Important");
				break;
			case "P":
				System.out.println("Person");
				break;
			default:
				System.out.println("Hatali giris");
		}



	}
}
