package data;

public class ehdokasVastaukset {
	
		int ehdokas_id;
		int kysymys_id;
		String vastaus;
		
		
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

		public String getVastaus() {
			return vastaus;
		}

		public void setVastaus(String vastaus) {
			this.vastaus = vastaus;
		}

		public ehdokasVastaukset(int ehdokas_id, int kysymys_id, String vastaus) {
			this.ehdokas_id = ehdokas_id;
			this.kysymys_id = kysymys_id;
			this.vastaus = vastaus;
		}
		
		public ehdokasVastaukset() {
			
		}
		
	
}
