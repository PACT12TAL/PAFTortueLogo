package classeDuProgramme;

import java.util.ArrayList;
import java.util.HashMap;

public class Fonction extends Commande
{
<<<<<<< HEAD
	public Fonction(String name,int number) {
		super(name,number);
=======
	public Fonction(String name) {
		super(name);
		this.programme = null;
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
	}
	
	public boolean verify() {
		HashMap<String, DefFonction> liste = programme.getFonctionsList();
<<<<<<< HEAD
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
=======
		boolean test = liste.containsKey(name);
		return test;
	}
	
	public void execute() throws FonctionUndefinedException {
		if (this.verify()) {
			ArrayList<Instruction> instructions = programme.getFonctionsList().get(name).getInstructions();
			for (int i = 0; i < instructions.size(); i++){
				instructions.get(i).execute();
			}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
		}
		else {
			throw new FonctionUndefinedException();
		}
	}

<<<<<<< HEAD

}
=======
}
>>>>>>> 778e895dc1ea5a8669d52079a69512affbbb495b
