package classeDuProgramme;

import java.util.ArrayList;

public class Repete extends Instruction
{	
	private int nbreRepete;
	private ArrayList<Instruction> instr;
	
	public Repete(int nbreRepete , ArrayList<Instruction> instr)
	{
		this.nbreRepete = nbreRepete;
		this.instr = instr ;
		
		// prend la suite d'instruction
		
	}

	public Etat executerInstruction(Etat etat) throws FonctionUndefinedException
	{
		Etat et = etat;
		for(int i = 0 ; i< nbreRepete ; i++)
		{
			for (Instruction instruction : instr)
			{
				et = instruction.executerInstruction(et);
			}
			
		}
		return et;
	}

	public void setProgramme (Programme p)
	{
		programme = p ;
		for (Instruction instruction : instr)
		{
			instruction.setProgramme(p);
		}
		
	}

}
