package classeDuProgramme;

import java.lang.Math;;

public class Deplacement extends Commande
{
	
	public Deplacement(String name,int number) 
	{
		super(name, number);
				
	}
	
	
	public Etat executerInstruction (Etat etatAvant)
	{		
		Etat etatApres = etatAvant.clone();
				
		switch(nom)
		{
			case "avance":
				etatApres.addToX(nombre*Math.cos(ConvRadian(etatApres.getAngle())));  
				etatApres.addToY(nombre*Math.sin(ConvRadian(etatApres.getAngle())));
				programme.getFeuille().drawLine(ConvInt(etatApres.getX()),ConvInt(etatApres.getY()));				
				break;
				
			case "recule":
				etatApres.addToX((-1) * nombre*Math.cos(ConvRadian(etatApres.getAngle())));
				etatApres.addToY((-1) * nombre*Math.sin(ConvRadian(etatApres.getAngle())));
				programme.getFeuille().drawLine(ConvInt(etatApres.getX()),ConvInt(etatApres.getY()));			
				break;
				
			case "tournedroite":
				etatApres.addToAngle(nombre);
				programme.getFeuille().rotateTurtle(ConvRadian(etatApres.getAngle()));
				break;
				
			case "tournegauche":
				etatApres.addToAngle((-1) * nombre);
				programme.getFeuille().rotateTurtle(ConvRadian(etatApres.getAngle()));
				break;		
		}
		return etatApres;
	}

}
