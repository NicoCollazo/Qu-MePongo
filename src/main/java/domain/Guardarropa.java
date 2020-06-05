package domain;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
	Usuario dueño;
	enumGuardarropa tipoDeRopa;
	List<Prenda> prendasGuardadas = new ArrayList<Prenda>();
	List<Usuario> usuariosCompartidos = new ArrayList<Usuario>();
	
	public void quitarPrenda(Prenda unaPrenda) {
		if(!prendasGuardadas.contains(unaPrenda)) {
			throw new RuntimeException("La prenda no está en el guardarropa.");
		}
		prendasGuardadas.remove(unaPrenda);
		
	}

	public void agregarPrenda(Prenda unaPrenda) {
		prendasGuardadas.add(unaPrenda);
	}
}
