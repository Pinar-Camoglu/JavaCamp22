package multiDemoArray;

public class Main {

	public static void main(String[] args) {
		
		String [][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Pendik";
		sehirler[0][2] = "Marmara";
		sehirler[1][0] = "Samsun";
		sehirler[1][1] = "Atakum";
		sehirler[1][2] = "Karadeniz";
		sehirler[2][0] = "Artvin";
		sehirler[2][1] = "Hopa";
		sehirler[2][2] = "Karadeniz";
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("---------------------------");
		}
	}

}
