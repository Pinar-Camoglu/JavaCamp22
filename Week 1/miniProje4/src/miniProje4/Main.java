package miniProje4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int total1 = 0;
		int total2 = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz : ");
		int number1 = reader.nextInt();
		
		System.out.println("İkinci sayiyi giriniz : ");
		int number2 = reader.nextInt();
		
		for(int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				total1 +=i;
			}
		}
		for(int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				total2 +=i;
			}
		}
		
		if(number1 == total2 && number2 == total1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayilardir.");
		}
		else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayi değillerdir.");
		}
		
	}

}
