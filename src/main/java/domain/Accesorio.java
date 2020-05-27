package domain;

import java.util.ArrayList;
import java.util.List;

public class Accesorio implements InterfazPrenda{
	private enumAccesorio tipo;
	private String colorPrincipal,
	 			   colorSecundario;
	private List<Integer> rangoDeTemperatura = new ArrayList<Integer>();
	
	public Accesorio(enumAccesorio esteAccesorio, String nuevoColorPrincipal, String nuevoColorSecundario, List<Integer> unRangoDeTemperatura) {
		
		if(nuevoColorPrincipal == null) { throw new NullPointerException("El color principal no puede estar vac�o"); }
		colorPrincipal = nuevoColorPrincipal;
		
		colorSecundario = nuevoColorSecundario;
		
		if(esteAccesorio == null) {throw new NullPointerException("el tipo de prenda no puede estar vac�o");}
		tipo = esteAccesorio;
		
		if(unRangoDeTemperatura == null) {throw new NullPointerException("el rango de temperatura no puede estar vac�o");}
		rangoDeTemperatura = unRangoDeTemperatura;
	}
	
	@Override
	public List<Integer> getRangoDeTemperatura() {
		return rangoDeTemperatura;
	}
}
