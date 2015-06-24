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

	public Etat executerInstruction(Etat etatAvant) 
	{
		Etat etatApres = etatAvant.clone();
				
		switch(nom)
		{
			case "levecrayon" :		
				programme.getFeuille().changeColor("transparent");
				break;
				
			case "baissecrayon" :
				programme.getFeuille().changeColor(etatApres.getCouleur());
				break;
				
			case "taillecrayon" :
				etatApres.setTailleCrayon(nombre);
				programme.getFeuille().setPenSize(nombre);
				break;
				
			case "couleur":
				etatApres.setCouleur(mot);
				programme.getFeuille().changeColor(mot);
				break;		
		}
		return etatApres;
	}
}
