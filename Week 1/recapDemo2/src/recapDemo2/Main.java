package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {1.6,2.7,3.1,5.2};
		double total = 0;
		double max = myList[0];
		
		for(double number : myList) {
			if(max < number) {
				max = number;
			}
			System.out.println(number);
			total += number;
		}
		System.out.println("Toplam : " + total);
		System.out.println("Dizinin en büyük elemanı : " + max);
	}
}
