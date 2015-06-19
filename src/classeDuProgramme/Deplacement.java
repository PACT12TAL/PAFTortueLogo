package classeDuProgramme;
import java.lang.Math;

public class Deplacement extends Commande
{
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
}
