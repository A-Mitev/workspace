package CollectionTestKonservi;

public class Konserva {
	
	private String Proizvoditel;
	private int cena;
	private int gramaz;
	
	
	public Konserva(String proizvoditel, int cena, int gramaz) {
		setProizvoditel(proizvoditel);
		setGramaz(gramaz);
		setCena(cena);
	}
	public String getProizvoditel() {
		return Proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		Proizvoditel = proizvoditel;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getGramaz() {
		return gramaz;
	}
	public void setGramaz(int gramaz) {
		this.gramaz = gramaz;
	}

	@Override
	public String toString() {
		return "Konserva [Proizvoditel=" + Proizvoditel + ", cena=" + cena + ", gramaz=" + gramaz + "]";
	}
	
	
	
}

