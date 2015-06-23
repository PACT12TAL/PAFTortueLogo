package classeDuProgramme;

import java.util.ArrayList;
import java.util.HashMap;

public class Fonction extends Commande
{
	public Fonction(String name,int number) {
		super(name,number);
	}
	
	public boolean verify() {
		HashMap<String, DefFonction> liste = programme.getFonctionsList();
		boolean test = liste.containsKey(nom);
		return test;
	}
	
	public Etat executerInstruction(Etat etat) throws FonctionUndefinedException {
		if (this.verify()) {
			ArrayList<Instruction> instructions = programme.getFonctionsList().get(nom).getInstructions();
			for (int i = 0; i < instructions.size(); i++){
				instructions.get(i).executerInstruction(etat); //TODO
			}
			return null; //TODO implements return
		}
		else {
			throw new FonctionUndefinedException();
		}
	}


}