package domain;

public class RecomendadorAtuendos {
	AdapterClima proveedorClima = new ClimaAccuWeather();
	Integer temperatura = (Integer) proveedorClima.getTemperatura().get("Value");
	Integer cantidadDeUsosRestantes = 10;
	BuilderAtuendo builder = new BuilderAtuendo();
	
	public boolean checkearTemperatura(InterfazPrenda unaPrenda) {
		return     temperatura > unaPrenda.getRangoDeTemperatura().get(0) 
				&& temperatura < unaPrenda.getRangoDeTemperatura().get(1);
	}
	
	public void sugerirAccesorio(Accesorio unaPrenda) {
		if(checkearTemperatura(unaPrenda)) {
			builder.setAccesorio(unaPrenda);
		}
	}
	
	public void sugerirParteSuperior(ParteSuperior unaPrenda) {
		if(checkearTemperatura(unaPrenda)) {
			builder.setParteSuperior(unaPrenda);
		}
	}
	
	public void sugerirParteInferior(ParteInferior unaPrenda) {
		if(checkearTemperatura(unaPrenda)) {
			builder.setParteInferior(unaPrenda);
		}
	}
	
	public void sugerirCalzado(Calzado unaPrenda) {
		if(checkearTemperatura(unaPrenda)) {
			builder.setCalzado(unaPrenda);
		}
	}
	
	public void gastarUnUso() {
		cantidadDeUsosRestantes = cantidadDeUsosRestantes - 1;
	}
	
	public Atuendo sugerirAtuendo() {
		if(cantidadDeUsosRestantes == 0) {throw new RuntimeException("Si te sugiero otro atuendo, nos volvemos pobres");}
		
		gastarUnUso();
		return builder.crearAtuendo();
		
	}
	
}
