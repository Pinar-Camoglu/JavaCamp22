package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager2.Update();
		customerManager2.Remove();
		customerManager2.Add();
		System.out.println("--------------------------");
		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		System.out.println("--------------------------");
		for (int i = 0; i < sayilar2.length; i++) {
			System.out.println(sayilar2[i]);
		}
		System.out.println("--------------------------");
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
