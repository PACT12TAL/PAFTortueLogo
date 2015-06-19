package classeDuProgramme;

public class Etat extends Commande
{
	public Etat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void executer() 
	{
		switch(name)
		{
			case "levecrayon" :
				crayonbaisse=0;
				System.out.println(crayonbaisse);
				break;
			case "baissecrayon" :
				crayonbaisse=1;
				System.out.println(crayonbaisse);
				break;
			case "taillecrayon" :
				taillecrayon = nbr;
				System.out.println(angle);
				break;
			case "couleur":
				angle-=nbr;
				System.out.println(angle);
				break;		
		}
	}
}
