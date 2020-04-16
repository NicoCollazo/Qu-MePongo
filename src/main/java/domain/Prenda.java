package domain;

public class Prenda {
	private enumCategoria categoria; //ACCESORIO, PARTESUPERIOR, PARTEINFERIOR, CALZADO
	private String material;
	private String colorPrincipal;
	private String colorSecundario;
	
	
	public Prenda(enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		if(nuevaCategoria == null) { throw new NullPointerException("La categor�a no puede estar vac�a"); }
		categoria = nuevaCategoria;
		
		if(nuevoMaterial == null) { throw new NullPointerException("La categor�a no puede estar vac�a"); }
		material = nuevoMaterial;
		
		if(nuevoColorPrincipal == null) { throw new NullPointerException("La categor�a no puede estar vac�a"); }
		colorPrincipal = nuevoColorPrincipal;
		
		colorSecundario = nuevoColorSecundario;
	}
	
}
