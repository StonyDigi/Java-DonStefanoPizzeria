package hfDonStefanoPizzeriaKonzolos;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
public class FajlKezelo {
	private static String fejlec = "";
	@SuppressWarnings("unused")
	private static List<PizzaTarolo> Pizzak;
	@SuppressWarnings("rawtypes")
	public List<PizzaTarolo> fajlBeolvas (String fajlNev) {
		@SuppressWarnings("unchecked")
		List<PizzaTarolo> Pizzak = new ArrayList();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			fejlec = br.readLine();
			
			while (br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");

				PizzaTarolo ujPizzak = new PizzaTarolo(
						sorAdatok[0],
						sorAdatok[1],
						Integer.parseInt(sorAdatok[2]),
						Integer.parseInt(sorAdatok[3]),
						sorAdatok[4].equals("1"));
				Pizzak.add(ujPizzak);	
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return Pizzak;	
	}
	public static void akciosPizzakFajlbaIr(List<PizzaTarolo> Pizzak) {
		try {
			FileOutputStream fs = new FileOutputStream("akcios_konzolos.csv", false);
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			out.write(fejlec);
			out.write("\n");
			for (PizzaTarolo item : Pizzak) {
				if(item.isAkciosSzovegesen().equalsIgnoreCase("igen")) {
					out.write(item.getAzonosito());
					out.write(";");
					out.write(item.getNev());
					out.write(";");
					out.write(item.getEgysegAr().toString());
					out.write(";");
					out.write(item.getEladottDb().toString());
					out.write(";");
					if(item.isAkcios()) {
						out.write("1");
					} else {
						out.write("0");
					}
					out.write("\n");
				}	
			}
			out.close();
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("A fájl nem található az elérési útvonalon!!!");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Nem támogatott enkódolás!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Sajnálom!!! I / O (eszköz) hiba lépett fel...");
		}
		System.out.println("!!! Létrejött az akcios_konzolos.csv a workspace-n belül !!!");
	}
	public void fajlMegnyit() {
		File file = new File("C:\\Users\\stony\\Desktop\\Workspace\\webler_13\\akcios.csv");
		if (!Desktop.isDesktopSupported()) {
			System.out.println("Nem támogatott OP rendszer az asztali megnyitáshoz!!!");
			return;
		}
		Desktop desktop = Desktop.getDesktop();
		if(file.exists()) {
			try {
				desktop.open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("I / O (eszköz) hiba lépett fel!!!");
			}
		}	
	}
}