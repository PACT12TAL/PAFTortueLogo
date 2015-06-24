package classeDuProgramme;

import java.util.ArrayList;

public abstract class Instruction 
{

	public int nbr;
	public String string;
	public ArrayList<String> Instruction= new ArrayList<String>();
	public Programme programme;
	public static final double tailleFeuille = 400.0 ;
	public static final double milieuF = (tailleFeuille/2) ;
	
	public Instruction ()
	{}

	abstract  Etat executerInstruction(Etat etat) throws FonctionUndefinedException ;

	public void setProgramme (Programme p)
	{
		programme = p ;
	}
}
