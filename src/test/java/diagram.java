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

public class ParteInferior extends Prenda{
	private enumCategoria.PARTEINFERIOR tipo;
	
	public ParteInferior(enumCategoria.PARTEINFERIOR estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super( nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}

public class Calzado extends Prenda{
	private enumCategoria.CALZADO tipo;
	
	public Calzado(enumCategoria.CALZADO esteCalzado, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteCalzado == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteCalzado;
	}
}

public class Accesorio extends Prenda {
	private enumCategoria.ACCESORIO tipo;
	
	public Accesorio(enumCategoria.ACCESORIO esteAccesorio, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(esteAccesorio == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = esteAccesorio;
	}
}

public class ParteSuperior extends Prenda{
	private enumCategoria.PARTESUPERIOR tipo;

	public ParteSuperior(enumCategoria.PARTESUPERIOR estaParte, enumCategoria nuevaCategoria, String nuevoMaterial, String nuevoColorPrincipal, String nuevoColorSecundario) {
		super(nuevaCategoria, nuevoMaterial, nuevoColorPrincipal, nuevoColorSecundario);
		
		if(estaParte == null) {throw new NullPointerException("el tipo de prenda no puede estar vacío");}
		tipo = estaParte;
	}
}

public class Prenda {
	private enumCategoria categoria; //ACCESORIO, PARTESUPERIOR, PARTEINFERIOR, CALZADO
	private String material;
	private String colorPrincipal;
	private String colorSecundario;
	
	public enumCategoria getCategoria() {
		return categoria;
	}
	
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

public enum enumCategoria {
	DUMMY;
	enum ACCESORIO{ PANIUELO, LENTES, GORRA, SOMBRERO };
	enum PARTESUPERIOR{ MUSCULOSA, MANGACORTA, MANGALARGA, BUZO, PULLOVER, CAMPERA, SACO };
	enum PARTEINFERIOR{ PANTALON, SHORT, POLLERA };
	enum CALZADO{ ZAPATILLAS, ZAPATOS, BOTAS, CROCS };
}
left to right direction
scale 500 width
@enduml



