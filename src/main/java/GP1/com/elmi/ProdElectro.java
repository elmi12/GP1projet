package GP1.com.elmi;


public class ProdElectro {

	public String code, A, B, C, D, E, energ;

	public int a;

	public String libelle;

	public ProdElectro(String c, String l, String u) {

		this.code = c;

		this.libelle = l;

		this.energ = u;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Energetique getType() {

		if (energ == "A") {

			return Energetique.Economique;

		} else if (energ == "B") {

			return Energetique.Economique;
		}

		else if (energ == "C") {

			return Energetique.Modere;
		}

		else if (energ == "D") {

			return Energetique.Energivore;
		}

		else

			return Energetique.Abuse;

	}

}
