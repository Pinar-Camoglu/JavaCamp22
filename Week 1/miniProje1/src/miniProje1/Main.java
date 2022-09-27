package miniProje1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Boolean isPrime = true;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sorgulanacak sayiyi giriniz : ");
		
		int number = reader.nextInt();
		
		if(number == 1) {
			System.out.println("1 : Asal sayi degildir.");
			return;
		}
		if(number < 1) {
			System.out.println("Geçersiz sayi girdiniz.");
			return;
		}
		
		for(int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		if(isPrime) {
			System.out.println(number +  " : Asal sayidir.");
		}
		else {
			System.out.println(number + " : Asal sayi degildir.");
		}
		
	}

}
