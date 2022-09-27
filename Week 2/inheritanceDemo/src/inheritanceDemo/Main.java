package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		AskerKrediManager askerKrediManager = new AskerKrediManager();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(ogretmenKrediManager);
		krediUI.KrediHesapla(tarimKrediManager);
		krediUI.KrediHesapla(askerKrediManager);
	}

}
