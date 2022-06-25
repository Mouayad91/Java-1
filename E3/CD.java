
public class CD extends Artikel {

	private String interpret;
	private String titel;
	private int anzahlTitel;

	public CD (int artikelNr, String art, double preis, String interpret, String titel, int anzahlTitel) {
		super(artikelNr, art, preis);
	this.interpret=interpret;
        this.titel=titel;
	this.anzahlTitel=anzahlTitel;


	
}

	public String getInterpret() {
		return interpret;
	}

	public void setInterpret(String interpret) {
		  if (interpret != null) {
	          this.setInterpret(interpret);
	      } else {
	          throw new IllegalArgumentException("Interpret muss angegeben werden");
	      }

		
		this.interpret = interpret;
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

	public int getAnzahlTitel() {
		return anzahlTitel;
	}

	public void setAnzahlTitel(int anzahlTitel) {
		this.anzahlTitel = anzahlTitel;
	}
	
        public String getBeschreibung(){
         
            return (this.interpret+":"+this.titel);
        }

}