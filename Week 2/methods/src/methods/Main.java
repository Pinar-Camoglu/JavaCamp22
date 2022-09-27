package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		Boolean isFound = false;
		int indis = 0;
		String mesaj = " ";
		int[] numbers = new int[]{1, 326, 9, 72, 36, 48, 56};
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
			mesaj = soughtNumber + " sayısı " + indis + ".indiste bulundu. Dizinin " + (indis+1) + ".elemanı.";
			mesajVer(mesaj);
		}
		else {
			mesajVer("Sayı dizide bulunmuyor.");
		}
		
	}
	
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
	}
	
}
