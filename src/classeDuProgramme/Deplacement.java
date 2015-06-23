package classeDuProgramme;
import java.lang.Math;

public class Deplacement extends Commande
{
<<<<<<< HEAD
	
	public Deplacement(String name,int number) 
	{
		super(name, number);
				
	}
	
	
	public Etat executerInstruction (Etat etatAvant)
	{		
		Etat etatApres = new Etat (etatAvant.getX(), etatAvant.getY(), etatAvant.getAngle(), etatAvant.getCrayonBaisse(), etatAvant.getTailleCrayon(), etatAvant.getCouleur()) ;
		
		switch(nom)
		{
			case "avance":
				etatApres.addToX(nombre*Math.sin((( etatApres.getAngle() *Math.PI)/180)));  
				etatApres.addToY(nombre*Math.cos((( etatApres.getAngle() *Math.PI)/180)));
				feuille.drawLine(Conv(etatAvant.getX()),Conv(etatAvant.getY()),Conv(etatApres.getX()),Conv(etatApres.getY()));				
				break;
				
			case "recule":
				etatApres.addToX(nombre*Math.sin((( etatApres.getAngle() *Math.PI)/180)));
				etatApres.addToY(nombre*Math.cos((( etatApres.getAngle() *Math.PI)/180)));
				feuille.drawLine(Conv(etatAvant.getX()),Conv(etatAvant.getY()),Conv(etatApres.getX()),Conv(etatApres.getY()));			
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

=======
	public Deplacement(String name) {
		super(name);
	}

	int nbr;
	
	public void executer ()
	{
		
		switch(name)
		{
			case "avance":
				x+=nbr*Math.sin(angle);
				y+=nbr*Math.cos(angle);
				System.out.println(x+y);
				break;
			case "recule":
				x-=nbr*Math.sin(angle);
				y-=nbr*Math.cos(angle);
				System.out.println(x+y);
				break;
			case "tournedroite":
				angle+=nbr;
				System.out.println(angle);
				break;
			case "tournegauche":
				angle-=nbr;
				System.out.println(angle);
				break;		
		}
		
		
	}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
}
