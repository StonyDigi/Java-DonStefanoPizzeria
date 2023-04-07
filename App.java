package hfDonStefanoPizzeriaKonzolos;

public class App {

	public static void main(String[] args) {
	Feladatok fObj = new Feladatok();
	@SuppressWarnings("unused")
	FajlKezelo fkObj = new FajlKezelo();
	System.out.println("Üdv a Don Stefano konzolos pizzériában!! :)");
	System.out.println();
	System.out.println("Feladat: 3. - Hozzon létre egy FajlKezelo\r\n" + 
			"osztályt, amelynek a fajlBeolvas() metódusa szöveges paraméterben kapjon egy fájlnevet, \r\n" + 
			"visszatérése pedig egy olyan lista legyen, amely Pizza -kat tartalmaz!:");
//	System.out.println(fkObj.fajlBeolvas("pizzeria.csv").toString()); debughoz
	System.out.println();
	fObj.adatokKiir();
	System.out.println();
	
	System.out.println("Feladat: 4. - A fájl tartalmaz egy hibás felvitelt, ahol nem 9 karakterhosszúságú a pizza azonosítója. Ezt az \r\n" + 
			"elemet töröljük az adatszerkezetünkbõl, a késõbbi számításoknál ne vegyük figyelembe!:");
	fObj.hibasIndexTorlese();
	System.out.println();
	fObj.adatokKiir();
	System.out.println("Hibás index törölve.....");
	System.out.println();
	
	System.out.print("Feladat: 5. - A legdrágább pizza : ");
	fObj.melyikPizzaAlegDragabb();
	System.out.println();
	
	System.out.println("Feladat: 6. - Teljes havi összbevétel");
	fObj.teljesHaviOsszBevetel();
	System.out.println();
	
	System.out.println("Feladat: 7. - A pizzafajták hány százaléka drágább, mint 2500 Ft? Az eredményt kerekítés nélkül, 2 tizedes jegyig\r\n" + 
			"írjuk ki: ");
	fObj.pizzakHanySzazalekaDragabbMint2500Ft();
	System.out.println();
	
	System.out.println("Feladat: 8. - Az akciós pizzákat írjuk ki azokat egy külön fájlba akcios.csv néven! A fájl kódolása UTF-8 legyen és \r\n" + 
			"az adatok sorrendje, formátuma az eredeti fájlban lévõvel meg kell egyeznie! Amennyiben a fájl \r\n" + 
			"létrehozása sikeres, jelenítsük meg az erre vonatkozó üzenetet!: ");
	System.out.println();
	fObj.fajlbaIr();
	fkObj.fajlMegnyit();
	}
}