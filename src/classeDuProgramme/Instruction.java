package classeDuProgramme;
<<<<<<< HEAD

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
	
=======
public abstract class Instruction 
{

	public double x;
	public double y;
	public double angle;
	public int crayonbaisse;
	public int taillecrayon;
	public int couleur;
	public int nbr;
	public String name;
	public Programme programme;
	
	public Instruction (String name)
	{
		this.name = name;
	}
	
	public void execute() throws FonctionUndefinedException {
		//TODO implement this
	}
	
	
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
}
