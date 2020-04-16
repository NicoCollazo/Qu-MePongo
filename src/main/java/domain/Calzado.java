package domain;

public class Calzado extends Prenda{
	private enumCALZADO tipo;
	
	public Calzado(enumCALZADO esteCalzado, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteCalzado == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteCalzado;
	}
}
