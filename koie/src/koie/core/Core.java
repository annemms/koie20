package koie.core;

import java.util.ArrayList;
import java.util.List;

import pages.GUI;
	
public class Core {
	//test

	public String userEmail; // Vi trenger ingen brukerklasse f�r det viser 
	public boolean isAdmin;	 // -> seg at disse to ikke er alt vi trenger.
	
	private GUI GUIClass;
	private DBConnector DBClass;
	
	public Core() {
		GUIClass = new GUI(this);
		DBClass = new DBConnector(this);
	}

	public boolean login(String email) {
		// TODO
		return false;
	}

	public ArrayList<String> getKoieRow(int koieID) {
		// TODO
		return new ArrayList<String>();
	}

	// Returnerer 2D-ArrayList av �n eller flere kolonner:
	// * Husk n�r vi lager ArrayList: "List l = ArrayList". Derfor er det Array<List> som m� gj�res om til ArrayList<ArrayList> n�r den skapes -Sindre
	public ArrayList<List<String>> getDataBaseColumns(String DBName, String... attributeName) {
		// TODO
		return new ArrayList<List<String>>();
	}

	// Dersom vi trenger det: Denne gir en enkelt-celles verdi -Sindre
	public String getKoieAttribute(int koieID, String attributeName) {
		// TODO
		return "";
	}
	
	// Husk! All DBConnector-p�kallelser m� g� igjennom en metode her f�rst. -Sindre 
}
