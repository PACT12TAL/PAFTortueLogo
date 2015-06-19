package classeDuProgramme;

import java.util.ArrayList;
import java.util.HashMap;

public class Fonction extends Commande
{
	public Fonction(String name) {
		super(name);
		this.programme = null;
	}
	
	public boolean verify() {
		HashMap<String, DefFonction> liste = programme.getFonctionsList();
		boolean test = liste.containsKey(name);
		return test;
	}
	
	public void execute() throws FonctionUndefinedException {
		if (this.verify()) {
			ArrayList<Instruction> instructions = programme.getFonctionsList().get(name).getInstructions();
			for (int i = 0; i < instructions.size(); i++){
				instructions.get(i).execute();
			}
		}
		else {
			throw new FonctionUndefinedException();
		}
	}

}
