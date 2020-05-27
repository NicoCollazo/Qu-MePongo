package domain;

import java.util.ArrayList;
import java.util.List;

public interface InterfazPrenda {
	String material = "";
	String colorSecundario = "";
	List<Integer> rangoDeTemperatura = new ArrayList<Integer>();
	
	public List<Integer> getRangoDeTemperatura();

}
