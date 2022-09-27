package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava harika.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("9. eleman : " + mesaj.charAt(8));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj); //Ustte yaptıgımız dikkate alınmadı.Baska bir stringe atayarak kalıcı yapabiliriz.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("a"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); 
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // Soldan ilk buldugu harfin yada kelimenin indisini verir.
		System.out.println(mesaj.lastIndexOf("a")); // Sagdan ilk buldugunun indisi
		
		
		System.out.println(mesaj.replace("a", "i").replace("i", "e"));
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
