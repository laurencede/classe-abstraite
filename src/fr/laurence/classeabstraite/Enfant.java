package fr.laurence.classeabstraite;

public class Enfant extends Mere {

	@Override
	public void direBonsoir() {
		System.out.println("Bonsoir, je suis l'enfant !");
	}

	public void bonjour() {
		super.bonjour(); // l'enfant appelle la classe de la Mere
		System.out.println("Hello, je suis l'enfant");
	}

	public void bonjourBonsoir() {
		super.bonjour(); // on appelle les fonctionnalit�s de la classe Mere
		this.direBonsoir(); // on appelle les fonctionnalit�s de la classe elle-m�me
	}

}
