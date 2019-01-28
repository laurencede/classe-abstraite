package fr.laurence.classeabstraite;

public abstract class Mere {
	protected String nom;
	protected String prenom;
	protected int age;

	public void bonjour() {
		System.out.println("Bonjour!!!!");
	}

	public abstract void direBonsoir();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
