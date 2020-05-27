package domain;

public class BuilderAtuendo {
	private Accesorio accesorio;
	private ParteSuperior parteSuperior;
	private ParteInferior parteInferior;
	private Calzado calzado;
	
	public void setAccesorio(Accesorio accesorio) {
		this.accesorio = accesorio;
	}
	public void setParteSuperior(ParteSuperior parteSuperior) {
		this.parteSuperior = parteSuperior;
	}
	public void setParteInferior(ParteInferior parteInferior) {
		this.parteInferior = parteInferior;
	}
	public void setCalzado(Calzado calzado) {
		this.calzado = calzado;
	}
	
	public Atuendo crearAtuendo() {
		return new Atuendo(accesorio, parteSuperior, parteInferior, calzado);
	}
}
