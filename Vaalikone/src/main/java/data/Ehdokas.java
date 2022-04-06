package data;

public class Ehdokas {
	private int id;
	private String etunimi;
	private String kotipaikkakunta;
	private int ika;
	private String ammatti;
	private String kommentti;
	private int tulos;
	public int getTulos() {
		return tulos;
	}
	public void setTulos(int tulos) {
		this.tulos = tulos;
	}
	public Ehdokas(String id, String etunimi, String kotipaikkakunta, int ika, String ammatti, String kommentti) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.etunimi=etunimi;
		this.kotipaikkakunta=kotipaikkakunta;
		this.ika=ika;
		this.ammatti=ammatti;
		this.kommentti=kommentti;
	}
	public Ehdokas() {
		// TODO Auto-generated constructor stub
	}
	public Ehdokas(int id , int tulos) {
		this.id = id;
		this.tulos = tulos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		try {
			this.id = Integer.parseInt(id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getKotipaikkakunta() {
		return kotipaikkakunta;
	}
	public void setKotipaikkakunta(String kotipaikkakunta) {
		this.kotipaikkakunta = kotipaikkakunta;
	}
	public int getIka() {
		return ika;
	}
	public void setIka(int ika) {
		this.ika = ika;
	}
	public String getAmmatti() {
		return ammatti;
	}
	public void setAmmatti(String ammatti) {
		this.ammatti = ammatti;
	}
	public String getKommentti() {
		return kommentti;
	}
	public void setKommentti(String kommentti) {
		this.kommentti = kommentti;
	}
	
	
	
}

