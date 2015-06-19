package classeDuProgramme;

import java.util.ArrayList;
import java.util.HashMap;

public class Programme {
	private HashMap<String, DefFonction> fonctionsList;
	
	public Programme() {
		this.fonctionsList = new HashMap<String, DefFonction>();
	}
	
	public HashMap<String, DefFonction> getFonctionsList(){
		return this.fonctionsList;
	}
	
	public void add(DefFonction fonction) {
		this.fonctionsList.put(fonction.getName(), fonction);
	}

}
