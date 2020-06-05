package domain;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
	Usuario due�o;
	enumGuardarropa tipoDeRopa;
	List<Prenda> prendasGuardadas = new ArrayList<Prenda>();
	List<Usuario> usuariosCompartidos = new ArrayList<Usuario>();
	
	public void quitarPrenda(Prenda unaPrenda) {
		if(!prendasGuardadas.contains(unaPrenda)) {
			throw new RuntimeException("La prenda no est� en el guardarropa.");
		}
		prendasGuardadas.remove(unaPrenda);
		
	}

	public void agregarPrenda(Prenda unaPrenda) {
		prendasGuardadas.add(unaPrenda);
	}
}
