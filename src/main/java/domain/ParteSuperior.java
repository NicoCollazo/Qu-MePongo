package domain;

import java.util.List;

public class ParteSuperior extends Prenda{
	private enumPARTESUPERIOR tipo;

	public ParteSuperior(enumPARTESUPERIOR estaParte, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario, List<Integer> unRangoDeTemperatura) {
		super(nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario, unRangoDeTemperatura);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}
