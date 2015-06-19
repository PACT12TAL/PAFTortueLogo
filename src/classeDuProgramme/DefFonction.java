package classeDuProgramme;

import java.util.ArrayList;

public class DefFonction {
	private String name;
	private ArrayList<Instruction> instructions;
	private Programme programme;
	
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
