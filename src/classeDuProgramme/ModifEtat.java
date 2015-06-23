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
				feuille.changeColor("transparent");
				break;
				
			case "baissecrayon" :
				feuille.changeColor(etatApres.getCouleur());
				break;
				
			case "taillecrayon" :
				etatApres.setTailleCrayon(nombre);
				feuille.setPenSize(nombre);
				break;
				
			case "couleur":
				etatApres.setCouleur(mot);
				feuille.changeColor(mot);
				break;		
		}
		return etatApres;
	}
}
