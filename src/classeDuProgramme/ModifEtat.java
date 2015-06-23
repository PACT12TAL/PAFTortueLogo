package classeDuProgramme;

<<<<<<< HEAD
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

	public Etat executerInstruction(Etat etatAvant) 
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
		return etatApres;
	}
=======
public class ModifEtat {

>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
}
