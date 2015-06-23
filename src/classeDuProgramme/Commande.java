package classeDuProgramme;

import graphique.JCanvas;

public abstract class Commande extends Instruction
{
	//pour definir la commande
	String nom;
	int nombre;
	String mot;
	JCanvas feuille = new JCanvas() ;

	public Commande(String name,int number) 
	{
		nom = name;
		nombre = number;
	}

	public Commande(String name, String string) 
	{
		nom = name;
		mot = string;
	}	
	
	public int Conv(double x)
	{
		return( (int)Math.round(x) ) ;
	}
}
