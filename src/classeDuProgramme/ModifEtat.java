package classeDuProgramme;

public class ModifEtat extends Commande
{
	public ModifEtat(String name, int number) 
	{
		super(name, number);
	}
	public ModifEtat(String name, String string)
	{
		super(name, string);
	}

	public Etat executer(Etat etatAvant) 
	{
		Etat etatApres = new Etat (etatAvant.getX(), etatAvant.getY(), etatAvant.getAngle(), etatAvant.getCrayonBaisse(), etatAvant.getTailleCrayon(), etatAvant.getCouleur()) ;
		
		switch(nom)
		{
			case "levecrayon" :
				etatApres.setCrayonBaisse(0);				
				break;
				
			case "baissecrayon" :
				etatApres.setCrayonBaisse(1);
				break;
				
			case "taillecrayon" :
				etatApres.setTailleCrayon(nombre);
				break;
				
			case "couleur":
				etatApres.setCouleur(mot);
				break;		
		}
		return null;
	}
}
