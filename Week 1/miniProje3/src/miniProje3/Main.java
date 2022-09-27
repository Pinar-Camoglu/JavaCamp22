package miniProje3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int total = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sorgulanacak sayiyi giriniz : ");
		
		int number = reader.nextInt();
		
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(number == total) {
			System.out.println(number + " : Mükemmel sayi");
		}
		else {
			System.out.println(number + " : Mükemmel sayi degil");
		}
		
	}

}
