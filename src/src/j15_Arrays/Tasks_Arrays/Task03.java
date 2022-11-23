package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
       Task-> Verilen  bir arrayin tum elemanlarini
       bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[]= {1,2,3};

		int yeniArr[]=new int[arr.length];

		for (int i = 1; i < arr.length; i++) { // burada ayni uzunlukta olusturulan yeni array`e tum elemanlar bir
			yeniArr[i-1]=arr[i];			   // sola kaydirilarak eklendi. yeni arrayin son index elemani default deger almis oldu
		}

		yeniArr[arr.length-1]=arr[0]; // Burada input arrayin 0. index elemani yeni arrayin sonuncu sirasina eklendi

		System.out.println("input Arr= "+Arrays.toString(arr));
		System.out.println("output Arr= "+Arrays.toString(yeniArr));

	}

}
