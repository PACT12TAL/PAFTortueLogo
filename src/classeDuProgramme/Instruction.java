package classeDuProgramme;

import java.util.ArrayList;

public abstract class Instruction 
{

	public int nbr;
	public String string;
	public ArrayList<String> Instruction= new ArrayList<String>();
	public Programme programme;
	
	public Instruction ()
	{}

	abstract  Etat executerInstruction(Etat etat) throws FonctionUndefinedException ;

	public void setProgramme (Programme p)
	{
		programme = p ;
	}
}
