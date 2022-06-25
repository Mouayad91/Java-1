public class Buch extends Artikel {

	private String autor;
	private String titel;
	private String verlag;

	
	public Buch(int artikelNr, String art, double preis,String autor, String titel, String verlag) {
		super(artikelNr, art, preis);
	        this.autor=autor;
		this.titel=titel;
		this.verlag=verlag;



}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		
		  if (autor != null) {
	          this.setAutor(autor);
	      } else {
	          throw new IllegalArgumentException("Interpret muss angegeben werden");
	      }

	}


	public String getTitel() {
		return titel;
	}


	public void setTitel(String titel) {
		  if (titel != null) {
	          this.setTitel(titel);
	      } else {
	          throw new IllegalArgumentException("titel muss angegeben werden");
	      }

	}


	public String getVerlag() {
		return verlag;
	}


	public void setVerlag(String verlag) {
		  if (verlag != null) {
	          this.setVerlag(verlag);
	      } else {
	          throw new IllegalArgumentException("verlag muss angegeben werden");
	      }

	}
        public String getBeschreibung(){
         
            return (this.autor+":"+this.titel);
        }
}
