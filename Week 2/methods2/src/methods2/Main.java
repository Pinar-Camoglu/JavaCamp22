package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj =  mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		
		String sehir = sehirVer();
		System.out.println(sehir);
		
		int plaka = topla(21,32);
		System.out.println("Plaka : " + plaka);
		
		int toplam = topla2(5,40,6,2);
		System.out.println(toplam);
		
		int toplam2 = topla2();
		System.out.println(toplam2);
		
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int a, int b) {
		return (a + b);
	}
	
	public static int topla2(int...sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Rize";
	}
}
