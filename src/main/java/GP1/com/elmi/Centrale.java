package GP1.com.elmi;

public class Centrale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clients c = new Clients("elmi", "M", "14 voie cite viotte", 29);

		// ProdAliement P=new ProdAliement(25,14,"yaourt");

		ProdAliement PA = new ProdAliement(25, 14, "yarout");

		ProdElectro pE = new ProdElectro("cres", "TV", "B");

		Caisse ce = new Caisse(24, 15);

		categoriedeproduit cc = new categoriedeproduit(PA, pE, ce, "125er", "20/03/2020");

		System.out.println("=======");

		System.out.println(c.getNom() + "," + c.getSexe() + "," + c.getAdress() + "," + c.getAge() + ","
				+ PA.getDatedefabrication() + "," + PA.getDatelimite() + "," + PA.getLibelle() + "," + pE.getCode()
				+ "," + pE.getLibelle() + "," + pE.getType() + "," + cc.getDate() + "," + cc.getNum() + ","
				+ ce.getPrixA() + "," + ce.getPrixE());


	}

}
