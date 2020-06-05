package domain;

public class Quitar implements Command {

	@Override
	public void ejecutar() {
		unGuardarropa.quitarPrenda(unaPrenda);

	}

}
