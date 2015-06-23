package classeDuProgramme;

public abstract class Commande extends Instruction
{
<<<<<<< HEAD
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
=======

	public Commande(String name) {
		super(name);
	}

	public void executer() 
	{
	}
	
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
}
