package domain;

import java.util.List;

public class ParteInferior extends Prenda{
	private enumPARTEINFERIOR tipo;
	
	public ParteInferior(enumPARTEINFERIOR estaParte, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario, List<Integer> unRangoDeTemperatura) {
		super(nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario, unRangoDeTemperatura);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}
