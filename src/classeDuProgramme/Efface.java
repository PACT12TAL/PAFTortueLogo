package classeDuProgramme;

public class Efface extends Commande 
{	
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
}
