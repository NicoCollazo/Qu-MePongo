package domain;

public class Accesorio extends Prenda {
	private enumAccesorio tipo;
	
	public Accesorio(enumAccesorio esteAccesorio, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteAccesorio == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteAccesorio;
	}
}
