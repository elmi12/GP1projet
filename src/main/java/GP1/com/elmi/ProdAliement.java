package GP1.com.elmi;



public class ProdAliement {

	private int Datedefabrication;

	private int Datelimite;

	public String libelle;

	public ProdAliement(int df, int dl, String l) {

		this.Datedefabrication = df;

		this.Datelimite = dl;

		this.libelle = l;
	}

	public int getDatedefabrication() {
		return Datedefabrication;
	}

	public void setDatedefabrication(int datedefabrication) {
		Datedefabrication = datedefabrication;
	}

	public int getDatelimite() {
		return Datelimite;
	}

	public void setDatelimite(int datelimite) {
		Datelimite = datelimite;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
