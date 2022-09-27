package miniProje5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Boolean isFound = false;
		int indis = 0;
		int[] numbers = new int[]{1, 2, 9, 72, 36, 48, 56};
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Aranacak sayiyi giriniz : ");
		int soughtNumber = reader.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == soughtNumber) {
				isFound = true;
				indis = i;
				break;
			}
		}
		
		if(isFound) {
			System.out.println(soughtNumber + " sayısı " + indis + ".indiste bulundu. Dizinin " + (indis+1) + ".elemanı." );
		}
		else {
			System.out.println("Sayı dizide bulunmuyor.");
		}
		
	}

}
