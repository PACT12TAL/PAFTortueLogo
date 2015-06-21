package classeDuProgramme;
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
	
	
}
