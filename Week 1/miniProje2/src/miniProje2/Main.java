package miniProje2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sesli bir harf giriniz : ");
		
		char harf = scan.next().charAt(0);
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println(harf + " : Kalin sesli harf.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println(harf + " : İnce sesli harf.");
			break;
		default:
			System.out.println("Geçersiz girdi girdiniz.");
		
		}
		
	}

}
