package classeDuProgramme;
import java.lang.Math;

public class Deplacement extends Commande
{
	
	public Deplacement(String name,int number) 
	{
		super(name, number);
				
	}
	
	public Etat executer (Etat etatAvant)
	{		
		Etat etatApres = new Etat (etatAvant.getX(), etatAvant.getY(), etatAvant.getAngle(), etatAvant.getCrayonBaisse(), etatAvant.getTailleCrayon(), etatAvant.getCouleur()) ;
		
		switch(nom)
		{
			case "avance":
				etatApres.addToX(nombre*Math.sin((( etatApres.getAngle() *Math.PI)*180)));  
				etatApres.addToY(nombre*Math.cos((( etatApres.getAngle() *Math.PI)*180)));
				break;
				
			case "recule":
				etatApres.addToX(nombre*Math.sin((( etatApres.getAngle() *Math.PI)*180)));
				etatApres.addToY(nombre*Math.cos((( etatApres.getAngle() *Math.PI)*180)));
				break;
				
			case "tournedroite":
				etatApres.addToAngle(nombre);
				break;
				
			case "tournegauche":
				etatApres.addToAngle((-1) * nombre);
				break;		
		}
		return etatApres;
	}

}
