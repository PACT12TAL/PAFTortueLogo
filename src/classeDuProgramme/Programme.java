package classeDuProgramme;

import java.util.ArrayList;
import java.util.HashMap;

public class Programme {
	private HashMap<String, DefFonction> fonctionsList;
<<<<<<< HEAD
	private ArrayList<Instruction> instructionsList;
	
	public Programme() {
		this.fonctionsList = new HashMap<String, DefFonction>();
		this.instructionsList = new ArrayList<Instruction>();
=======
	
	public Programme() {
		this.fonctionsList = new HashMap<String, DefFonction>();
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
	}
	
	public HashMap<String, DefFonction> getFonctionsList(){
		return this.fonctionsList;
	}
	
<<<<<<< HEAD
	public ArrayList<Instruction> getInstructionsList() {
		return instructionsList;
	}
	
	public void addFonction(DefFonction fonction) {
		this.fonctionsList.put(fonction.getName(), fonction);
	}
	
	public void addInstruction(Instruction instr) {
		this.instructionsList.add(instr);
	}
	
	
	public Etat executerProgramme() throws FonctionUndefinedException 
	{
		Etat etatCourant = new Etat(0.0,0.0,0.0,1,1,"noir");
		return executerProgramme(etatCourant);
	}
	
	public Etat executerProgramme(Etat et) throws FonctionUndefinedException {
		Etat etat = et;
		for (Instruction instr : instructionsList)
			instr.setProgramme(this);
		for (DefFonction def : fonctionsList.values())
			def.setProgramme(this);
		for (Instruction instr: instructionsList)
		{
			etat = instr.executerInstruction(etat);
		}
		
		return etat;
	}

}
=======
	public void add(DefFonction fonction) {
		this.fonctionsList.put(fonction.getName(), fonction);
	}

}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b