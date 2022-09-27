package arrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Ege";
		String ogrenci3 = "Efruz";
		String ogrenci4 = "Eymen";
		
		System.out.println("1.öğrenci: " + ogrenci1);
		System.out.println("2.öğrenci: " + ogrenci2);
		System.out.println("3.öğrenci: " + ogrenci3);
		System.out.println("4.öğrenci: " + ogrenci4);
		
		System.out.println("\n---------------------\n");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Yezra";
		ogrenciler[2] = "Yüsra";
		ogrenciler[3] = "Levent";
		
		for(int i = 0; i < ogrenciler.length; i++) {
			System.out.println(i+1 + ".Öğrenci : " + ogrenciler[i]);
		}
		System.out.println("------------------");
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
