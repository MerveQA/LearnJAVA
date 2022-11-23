package src.HaftanınTaskiii;

import java.util.ArrayList;
import java.util.List;

public class T09_RomaRakami {

    /*
    TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/

    ArrayList <Integer> sayilar= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100));
    ArrayList <String> rRakamlari= new ArrayList<>(List.of
            ("I","II","III","VI","V","VI","VII","VIII","IX","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"));


}
