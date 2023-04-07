package hfDonStefanoPizzeriaKonzolos;

public class PizzaTarolo {
	
	private String azonosito;
	private String nev;
	private Integer egysegAr;
	private Integer eladottDb;
	private boolean akcios;
	
	public PizzaTarolo(String azonosito, String nev, Integer egysegAr, Integer eladottDb, boolean akcios) {
		
		this.azonosito = azonosito;
		this.nev = nev;
		this.egysegAr = egysegAr;
		this.eladottDb = eladottDb;
		this.akcios = akcios;
	}

	public String getAzonosito() {
		return azonosito;
	}

	public String getNev() {
		return nev;
	}

	public Integer getEgysegAr() {
		return egysegAr;
	}

	public Integer getEladottDb() {
		return eladottDb;
	}

	public boolean isAkcios() {
		return akcios;
	}
	
	public String toString () {
		return this.azonosito + ";"+this.nev + ";"+this.egysegAr + ";"+this.eladottDb + ";"+this.isAkciosSzovegesen() + "\n";
		
	}
	
	public String isAkciosSzovegesen () {
		String valasz = "Nem";
		if(this.akcios) {
			valasz = "Igen";
		}
		return valasz;
		
	}

}
