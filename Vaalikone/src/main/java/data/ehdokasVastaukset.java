package data;

public class ehdokasVastaukset {
	
		int ehdokas_id;
		int kysymys_id;
		int vastaus;
		
		
		public ehdokasVastaukset(int ehdokas_id, int kysymys_id, int vastaus) {
			this.ehdokas_id = ehdokas_id;
			this.kysymys_id = kysymys_id;
			this.vastaus = vastaus;
		}
		
		public ehdokasVastaukset() {
			
		}
		
		public int getEhdokas_id() {
			return ehdokas_id;
		}
		public void setEhdokas_id(int ehdokas_id) {
			this.ehdokas_id = ehdokas_id;
		}
		public int getKysymys_id() {
			return kysymys_id;
		}
		public void setKysymys_id(int kysymys_id) {
			this.kysymys_id = kysymys_id;
		}
		public int getVastaus() {
			return vastaus;
		}
		public void setVastaus(int vastaus) {
			this.vastaus = vastaus;
		}
	
}
