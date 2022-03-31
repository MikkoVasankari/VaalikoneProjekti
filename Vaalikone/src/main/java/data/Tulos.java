package data;

public class Tulos {
	
	int id;
	String vastaus;
	
	public Tulos(int id, String vastaus) {
		this.id = id;
		this.vastaus = vastaus;
	}
	public Tulos() {
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVastaus() {
		return vastaus;
	}

	public void setVastaus(String vastaus) {
		this.vastaus = vastaus;
	}
	
}
