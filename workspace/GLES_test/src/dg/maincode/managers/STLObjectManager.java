package dg.maincode.managers;

import java.util.ArrayList;
import java.util.HashMap;
import dg.maincode.STLObjecten.STLTriagle;
import dg.maincode.STLObjecten.STLSide;

public class STLObjectManager {	
	static private HashMap<String,STLTriagle> STLObjecten;
	static{
		//anything static that needs to be initialized for this class;
		STLObjecten = new HashMap<String, STLTriagle>();
	}
	
	static public void addNewObject(ArrayList<STLSide> sTLSides, String name, int iD){
		STLObjecten.put(name, new STLTriagle(sTLSides, name, iD));
	}
	
	static public STLTriagle getObject(String name){
		return STLObjecten.get(name);
	}
	
	static public ArrayList<float[]> getFloatDataFromObject(String name){
		return STLObjecten.get(name).getSTLObjectFloatData();
	}
	
	static public float[] FloatDataToFloatVerticesData(ArrayList<float[]> FloatData){
		float[] VerticesData = new float[FloatData.size()*7];
		int vdPosition = 0;
		for(int i = 0;i < FloatData.size();i++){
			VerticesData[vdPosition] = FloatData.get(i)[0];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[1];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[2];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[3];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[4];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[5];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[6];
			vdPosition++;
		}
		
		return VerticesData;
	}
	
	static public void generateDummyObjects(){
		
		//O1 dummy
		ArrayList<STLSide> sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
		STLObjecten.put("O1",new STLTriagle(sTLSides, "O1", 0));
		
		//O2 dummy
		sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f));
		STLObjecten.put("O2",new STLTriagle(sTLSides, "O2", 1));
		
		//O3 dummy
		sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.5f, 0.5f, 0.5f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f));
		STLObjecten.put("O3",new STLTriagle(sTLSides, "O3", 1));
	}
	
}
