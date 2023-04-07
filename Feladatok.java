package hfDonStefanoPizzeriaKonzolos;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Feladatok {
	public FajlKezelo fkObj = new FajlKezelo();
	public List<PizzaTarolo> Pizzak = new FajlKezelo().fajlBeolvas("pizzeria.csv");
	
	public void hibasIndexTorlese() {
		int hibasIndex = -1;
		for (int i = 0; i < Pizzak.size(); i++) {
			if(Pizzak.get(i).getAzonosito().toString().length() !=9) {
				hibasIndex = i;
			}
		}
		Pizzak.remove(hibasIndex);
	}
	public void adatokKiir() {
		Pizzak.forEach(x -> System.out.println(x)); //lambda expression ki�r�s :)
		}	

	public void melyikPizzaAlegDragabb() {
		int maxErtek = 0;
		PizzaTarolo legDragabbPizza = Pizzak.stream()
				.filter(x->x.getEgysegAr()>maxErtek)
				.max(Comparator.comparing(PizzaTarolo::getEgysegAr))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(legDragabbPizza);	
	}
	public void teljesHaviOsszBevetel() {
		
		Integer teljesOsszBevetel = Pizzak.stream().map(x->x.getEgysegAr() * x.getEladottDb())
				.collect(Collectors.summingInt(Integer::intValue));
		
		String pattern = "#,###,###";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		decimalFormat.setGroupingSize(3);
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("Teljes havi �sszbev�tel: "+df.format(teljesOsszBevetel)+ " Ft");
	}
	public void pizzakHanySzazalekaDragabbMint2500Ft() {
		
		double dragabbMint2500FtSzazalekosan = Pizzak.stream().mapToDouble(obj -> obj.getEgysegAr()>2500 ? 1 : 0)
				.summaryStatistics()
				.getAverage();
		
		DecimalFormat df = new DecimalFormat("0.0#");
		System.out.println("A pizz�k ennyi sz�zal�ka dr�g�bb mint 2500 Ft: " +df.format(dragabbMint2500FtSzazalekosan*100) + "%");
	}
	@SuppressWarnings("static-access")
	public void fajlbaIr() {
		fkObj.akciosPizzakFajlbaIr(Pizzak);
}
}
