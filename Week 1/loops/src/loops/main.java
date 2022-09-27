package loops;

public class main {

	public static void main(String[] args) {
		
		//For
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("\n1.Döngü bitti - 2.Döngü başladı\n");
		for(int i = 9; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("\n2.Döngü bitti.");	
		
		// While
		
		int i = 5;
		while(i < 101) {
			System.out.println(i);
			i+=5;
		}
		
		// Do While
		
		int j = 2;
		do {
			System.out.println(j);
			j += 2;
		}while(j < 10);
		System.out.println("\nDo-While Döngüsü Bitti.");
	}

}
