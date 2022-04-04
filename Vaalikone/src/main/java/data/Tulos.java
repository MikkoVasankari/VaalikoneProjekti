package data;

public class Tulos {
	
	int id;
	String vastaus;
	String vastaus1;
	int ehdokasNum;
	
	public Tulos(int id, String vastaus) {
		this.id = id;
		this.vastaus = vastaus;
	}
	public Tulos(int id,int ehdokasNum, String ehdokkaanVastaus) {
		this.ehdokasNum = ehdokasNum;
		this.id = id;
		this.vastaus1 = ehdokkaanVastaus;
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
	public String getVastaus1() {
		return vastaus1;
	}
	public void setVastaus1(String vastaus1) {
		this.vastaus1 = vastaus1;
	}
	public int getEhdokasNum() {
		return ehdokasNum;
	}
	public void setEhdokasNum(int ehdokasNum) {
		this.ehdokasNum = ehdokasNum;
	}

}
