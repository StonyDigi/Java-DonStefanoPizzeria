package hfDonStefanoPizzeriaKonzolos;

public class App {

	public static void main(String[] args) {
	Feladatok fObj = new Feladatok();
	@SuppressWarnings("unused")
	FajlKezelo fkObj = new FajlKezelo();
	System.out.println("�dv a Don Stefano konzolos pizz�ri�ban!! :)");
	System.out.println();
	System.out.println("Feladat: 3. - Hozzon l�tre egy FajlKezelo\r\n" + 
			"oszt�lyt, amelynek a fajlBeolvas() met�dusa sz�veges param�terben kapjon egy f�jlnevet, \r\n" + 
			"visszat�r�se pedig egy olyan lista legyen, amely Pizza -kat tartalmaz!:");
//	System.out.println(fkObj.fajlBeolvas("pizzeria.csv").toString()); debughoz
	System.out.println();
	fObj.adatokKiir();
	System.out.println();
	
	System.out.println("Feladat: 4. - A f�jl tartalmaz egy hib�s felvitelt, ahol nem 9 karakterhossz�s�g� a pizza azonos�t�ja. Ezt az \r\n" + 
			"elemet t�r�lj�k az adatszerkezet�nkb�l, a k�s�bbi sz�m�t�sokn�l ne vegy�k figyelembe!:");
	fObj.hibasIndexTorlese();
	System.out.println();
	fObj.adatokKiir();
	System.out.println("Hib�s index t�r�lve.....");
	System.out.println();
	
	System.out.print("Feladat: 5. - A legdr�g�bb pizza : ");
	fObj.melyikPizzaAlegDragabb();
	System.out.println();
	
	System.out.println("Feladat: 6. - Teljes havi �sszbev�tel");
	fObj.teljesHaviOsszBevetel();
	System.out.println();
	
	System.out.println("Feladat: 7. - A pizzafajt�k h�ny sz�zal�ka dr�g�bb, mint 2500 Ft? Az eredm�nyt kerek�t�s n�lk�l, 2 tizedes jegyig\r\n" + 
			"�rjuk ki: ");
	fObj.pizzakHanySzazalekaDragabbMint2500Ft();
	System.out.println();
	
	System.out.println("Feladat: 8. - Az akci�s pizz�kat �rjuk ki azokat egy k�l�n f�jlba akcios.csv n�ven! A f�jl k�dol�sa UTF-8 legyen �s \r\n" + 
			"az adatok sorrendje, form�tuma az eredeti f�jlban l�v�vel meg kell egyeznie! Amennyiben a f�jl \r\n" + 
			"l�trehoz�sa sikeres, jelen�ts�k meg az erre vonatkoz� �zenetet!: ");
	System.out.println();
	fObj.fajlbaIr();
	fkObj.fajlMegnyit();
	}
}