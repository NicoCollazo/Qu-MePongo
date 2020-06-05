package domain;

public class Agregar implements Command {

	@Override
	public void ejecutar() {
		unGuardarropa.agregarPrenda(unaPrenda);

	}


}
