package GP1.com.elmi;

public class Caisse {

	public int getPrixA() {
		return PrixA;
	}

	public void setPrixA(int prixA) {
		PrixA = prixA;
	}

	public int getPrixE() {
		return PrixE;
	}

	public void setPrixE(int prixE) {
		PrixE = prixE;
	}

	private int PrixA;

	private int PrixE;

	public Caisse(int a, int b) {

		this.PrixA = a;

		this.PrixE = b;

	}

}
