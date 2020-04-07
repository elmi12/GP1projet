package GP1.com.elmi;


	public class Clients {
		

		public String nom, sexe, Adress;

		public int age;

		public Clients(String n, String s, String a, int agee) {

			this.Adress = a;
			this.age = agee;
			this.nom = n;
			this.sexe = s;
		}

		public String Telphone;

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getSexe() {
			return sexe;
		}

		public void setSexe(String sexe) {
			this.sexe = sexe;
		}

		public String getAdress() {
			return Adress;
		}

		public void setAdress(String adress) {
			Adress = adress;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getTelphone() {
			return Telphone;
		}

		public void setTelphone(String telphone) {
			Telphone = telphone;
		}

	}


