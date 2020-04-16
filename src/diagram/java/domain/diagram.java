@startuml
public class Atuendo {
	private Accesorio accesorio;
	private ParteSuperior parteSuperior;
	private ParteInferior parteInferior;
	private Calzado calzado;
	

	public Atuendo(Accesorio nuevoAccesorio, ParteSuperior nuevaParteSuperior, ParteInferior nuevaParteInferior, Calzado nuevoCalzado) {
		accesorio = nuevoAccesorio;
		if(nuevaParteSuperior == null) {throw new NullPointerException("La parte superior no puede quedar al descubierto");}
		parteSuperior = nuevaParteSuperior;
		
		if(nuevaParteInferior == null) {throw new NullPointerException("La parte inferior no puede quedar al descubierto");}
		parteInferior = nuevaParteInferior;
		
		if(nuevoCalzado == null) {throw new NullPointerException("El calzado no puede quedar vacío");}
		calzado = nuevoCalzado;
	}
	
	
}
public class Prenda {
	private enumCategoria categoria; //ACCESORIO, PARTESUPERIOR, PARTEINFERIOR, CALZADO
	private String material;
	private String colorPrincipal;
	private String colorSecundario;
	
	
	public Prenda(enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		if(nuevaCategoria == null) { throw new NullPointerException("La categoría no puede estar vacía"); }
		categoria = nuevaCategoria;
		
		if(nuevoMaterial == null) { throw new NullPointerException("La categoría no puede estar vacía"); }
		material = nuevoMaterial;
		
		if(nuevoColorPrincipal == null) { throw new NullPointerException("La categoría no puede estar vacía"); }
		colorPrincipal = nuevoColorPrincipal;
		
		colorSecundario = nuevoColorSecundario;
	}
	
}
public class Calzado extends Prenda{
	private enumCALZADO tipo;
	
	public Calzado(enumCALZADO esteCalzado, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteCalzado == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteCalzado;
	}
}
public class ParteInferior extends Prenda{
	private enumPARTEINFERIOR tipo;
	
	public ParteInferior(enumPARTEINFERIOR estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super( nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}
public class ParteSuperior extends Prenda{
	private enumPARTESUPERIOR tipo;

	public ParteSuperior(enumPARTESUPERIOR estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}
public class Accesorio extends Prenda {
	private enumAccesorio tipo;
	
	public Accesorio(enumAccesorio esteAccesorio, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteAccesorio == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteAccesorio;
	}
}
public enum enumCategoria {
	ACCESORIO, PARTESUPERIOR, PARTEINFERIOR, CALZADO
}
public enum enumPARTESUPERIOR {
	 MUSCULOSA, MANGACORTA, MANGALARGA, BUZO, PULLOVER, CAMPERA, SACO 
}
public enum enumPARTEINFERIOR {
	PANTALON, SHORT, POLLERA
}
public enum enumCALZADO {
	ZAPATILLAS, ZAPATOS, BOTAS, CROCS
}

@enduml