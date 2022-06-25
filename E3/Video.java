public class Video extends Artikel {
private String titel;
private int spieldauer ;
private int jahr ;

	
	public Video(int artikelNr, String art, double preis, String titel, int spieldauer, int jahr) {
		super(artikelNr, art, preis);
		
		this.titel=titel;
		this.spieldauer=spieldauer;
		this.jahr=jahr;



}


	public String getTitel() {
		return titel;
	
	}


	public void setTitel(String titel) {
		  if (titel != null) {
	          this.setTitel(titel);
	      } else {
	          throw new IllegalArgumentException("titel darf nicht leer sein");
	      }
		
		this.titel = titel;
	
	
	}


	public int getSpieldauer() {
		return spieldauer;
	}


	public void setSpieldauer(int spieldauer) {
	    if (spieldauer > 0 && spieldauer < 60) {
            this.spieldauer = spieldauer;
        } else {
            throw new IllegalArgumentException("spieldauer muss in Minuten gegeben werden");
        }
	}


	public int getJahr() {
		return jahr;
	}


	public void setJahr(int jahr) {
		if (jahr > 1949 && jahr <= 2020) {
            this.jahr = jahr;
        } else {
            throw new IllegalArgumentException("Jahr muss zwische 1950-2020 sein");
        }
		this.jahr = jahr;
	}

	public String getBeschreibung(){
         
            return (this.titel);
        }
}
