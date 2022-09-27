package recapdemo;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 156;
		int sayi2 = 32;
		int sayi3 = 126;
		
		int enBuyuk;
		enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		else if(enBuyuk < sayi3){
			enBuyuk = sayi3;
		}
		else {
			enBuyuk = sayi1;
		}
		System.out.println("En buyuk sayi : " + enBuyuk);
	}
		
	}

}
