package classeDuProgramme;

public class Efface extends Commande 
{	
<<<<<<< HEAD
	public Efface(String name,int number) 
	{
		super(name, number);	
	}

	
	public Etat executerInstruction(Etat etatAvant)
	{	
		Etat etatApres = new Etat (0.0 , 0.0 , 0.0 , 1 , 1 , "noir" ) ;
		feuille.clear();
		return etatApres;
	}

=======
	public Efface(String name) {
		super(name);
	}

	public void executer ()
	{
		x=0;
		y=0;
		angle=0;
		efface();
		
	}

	private void efface() 
	{
		// methode qui doit enlever tous les anciens traits
		
	}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
}
