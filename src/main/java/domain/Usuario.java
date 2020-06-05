package domain;

import java.util.List;

public class Usuario {
	
	
	public void enviarSugerencias(Usuario destinatario, List<Command> sugerencias) {
		destinatario.procesarSugerencias(sugerencias);
	}
	
	public void procesarSugerencias(List<Command> sugerencias) {
		sugerencias.parallelStream().forEach(sugerencia -> sugerencia.ejecutar());
	}
}
