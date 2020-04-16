package domain;

public class ParteInferior extends Prenda{
	private enumPARTEINFERIOR tipo;
	
	public ParteInferior(enumPARTEINFERIOR estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super( nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}
