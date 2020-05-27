package domain;
import java.util.List;
import java.util.ArrayList;

public class Prenda implements InterfazPrenda{
	private String material;
	private String colorPrincipal,
				   colorSecundario;
	private List<Integer> rangoDeTemperatura = new ArrayList<Integer>();
	
	
	public Prenda(String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario, List<Integer> unRangoDeTemperatura) {
		
		if(nuevoMaterial == null) { throw new NullPointerException("El material no puede estar vac�a"); }
		material = nuevoMaterial;
		
		if(nuevoColorPrincipal == null) { throw new NullPointerException("El color principal no puede estar vac�o"); }
		colorPrincipal = nuevoColorPrincipal;
		
		colorSecundario = nuevoColorSecundario;
		
		if(unRangoDeTemperatura == null) {throw new NullPointerException("El rango de temperatura no puede estar vac�o"); }
		rangoDeTemperatura = unRangoDeTemperatura;
	}


	@Override
	public List<Integer> getRangoDeTemperatura() {
		return rangoDeTemperatura;
	}
	
}
