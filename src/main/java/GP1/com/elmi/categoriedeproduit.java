package GP1.com.elmi;

public class categoriedeproduit {

	private String num;
	private String date;
	ProdAliement p1;
	ProdElectro pEl;
	Caisse c;

	public categoriedeproduit(ProdAliement pR, ProdElectro pE, Caisse cee, String n, String date) {

		this.date = date;
		this.num = n;

		this.p1 = pR;

		this.pEl = pE;

		this.c = cee;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public ProdAliement getP1() {
		return p1;
	}

	public void setP1(ProdAliement p1) {
		this.p1 = p1;
	}

	public ProdElectro getpEl() {
		return pEl;
	}

	public void setpEl(ProdElectro pEl) {
		this.pEl = pEl;
	}

}