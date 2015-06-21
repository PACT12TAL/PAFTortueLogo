package classeDuProgramme;

public class Repete 
{	
	private int nbreRepete;
	private Instruction instr;
	
	public Repete(int nbreRepete , Instruction instr)
	{
		this.nbreRepete = nbreRepete;
		this.instr = instr ;
		
		// prend la suite d'instruction
		
	}

	public void executeRepete ()
	{
		for(int i = 0 ; i< nbreRepete ; i++)
		{
			instr.executerInstruction();
		}
	}
}
