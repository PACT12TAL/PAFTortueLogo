package classeDuProgramme;

import graphique.JCanvas;

public abstract class Commande extends Instruction
{
	//pour definir la commande
	String nom;
	int nombre;
	String mot;

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
	
	public int ConvInt(double x)
	{
		return( (int)Math.round(x) ) ;
	}
	
	public double ConvRadian(double x)
	{
		return ( (x * Math.PI) / 180 );
	}
}
