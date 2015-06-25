package classeDuProgramme;

import graphique.JCanvas;

public class Efface extends Commande 
{	
	public Efface(String name,int number) 
	{
		super(name, number);	
	}

	
	public Etat executerInstruction(Etat etatAvant)
	{	
		Etat etatApres = new Etat () ;
		programme.getFeuille().changeColor("Noir");
		programme.getFeuille().setPenSize(1);
		programme.getFeuille().clear();
		return etatApres;
	}

}
