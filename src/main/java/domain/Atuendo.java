package domain;

import java.util.*;

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
