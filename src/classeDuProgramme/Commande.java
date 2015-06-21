package classeDuProgramme;

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
	abstract Etat executer(Etat etat); 
	
	
}
