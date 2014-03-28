package DG.maincode.managers;

import java.util.HashMap;
import DG.maincode.STLObjecten.STLObject;
import DG.maincode.STLObjecten.STLTriagle;

public class STLTriagleManager {	
	static private HashMap<String,STLObject> STLObjecten;
	static{
		//anything static that needs to be initialized for this class;
		STLObjecten = new HashMap<String, STLObject>();
	}
	
	static public void addNewObject(HashMap<Integer, STLTriagle> sTLTriagles, String name, int iD){
		STLObjecten.put(name, new STLObject(sTLTriagles, name, iD));
	}
	
}
