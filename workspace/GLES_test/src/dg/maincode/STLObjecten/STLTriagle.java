package dg.maincode.STLObjecten;

import java.util.ArrayList;

public class STLTriagle {
	private ArrayList<STLSide> STLSides;
	private String name;
	private int ID;
	
	public STLTriagle(ArrayList<STLSide> sTLSides, String name, int iD) {
		super();
		STLSides = sTLSides;
		this.name = name;
		ID = iD;
	}
	
	public ArrayList<STLSide> getSTLTriagles() {
		return STLSides;
	}
	
	public void setSTLTriagles(ArrayList<STLSide> sTLSides) {
		STLSides = sTLSides;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public ArrayList<float[]> getSTLObjectFloatData(){
		ArrayList<float[]> STLObjectFloatData = new ArrayList<float[]>();
		for(STLSide t : STLSides){
			STLObjectFloatData.add(t.toFloatData());
		}
		return STLObjectFloatData;
	}		
	
}
