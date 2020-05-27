package domain;

import java.util.List;

public class Calzado extends Prenda{
	private enumCALZADO tipo;
	
	public Calzado(enumCALZADO esteCalzado, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario, List<Integer> unRangoDeTemperatura) {
		super(nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario, unRangoDeTemperatura);
		
		if(esteCalzado == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteCalzado;
	}
}
