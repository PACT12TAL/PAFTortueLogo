package classeDuProgramme;

public class Efface extends Commande 
{	
	public Efface(String name,int number) 
	{
		super(name, number);	
	}

	
	public Etat executer(Etat etatAvant)
	{	
		Etat etatApres = new Etat (0.0 , 0.0 , 0.0 , 1 , 1 , "noir" ) ;
		efface();
		return etatApres;
	}
	
	private void efface() 
	{
		// methode qui doit enlever tous les anciens traits		
	}


}
