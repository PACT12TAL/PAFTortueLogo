package classeDuProgramme;

import java.util.ArrayList;

public class DefFonction {
	private String name;
	private ArrayList<Instruction> instructions;
	private Programme programme;
	
<<<<<<< HEAD
	public DefFonction(String name, ArrayList<Instruction> instructions) 
	{
		this.instructions = instructions;
		this.name = name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public ArrayList<Instruction> getInstructions() 
	{
		return this.instructions;
	}
	
	public void setProgramme (Programme p)
	{
		programme = p ;
		for (Instruction instruction : instructions)
		{
			instruction.setProgramme(p);
		}
		
	}

}
=======
	public DefFonction(String name, ArrayList<Instruction> instructions) {
		this.instructions = instructions;
		this.name = name;
		this.programme = null;
		this.programme.add(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Instruction> getInstructions() {
		return this.instructions;
	}

}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
