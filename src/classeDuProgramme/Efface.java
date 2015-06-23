package classeDuProgramme;

public class Efface extends Commande 
{	
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

}
