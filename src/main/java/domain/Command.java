package domain;

public interface Command {
	Guardarropa unGuardarropa = new Guardarropa();
	Prenda unaPrenda = null;
	
	void ejecutar();
}
