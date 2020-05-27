import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.*;

class MockAPI implements AdapterClima{
	
	@Override
	public int getTemperatura() {
		return 22;
	}
}

public class testRecomendaciones {
	

	@Test
	public void unAccesorioDeInviernoNoSePuedeUsarEnVerano() {
		RecomendadorAtuendos recomendador = new RecomendadorAtuendos();

		List<Integer> temperaturas = new ArrayList<Integer>();
		temperaturas.add(-10);
		temperaturas.add(10);
		
		Accesorio accesorio = new Accesorio(enumAccesorio.BUFANDA, "rojo", "verde", temperaturas);

		Assert.assertFalse(recomendador.checkearTemperatura(accesorio));
	}
	
	@Test
	public void unAccesorioDeVeranoSePuedeUsarEnVerano() {
		RecomendadorAtuendos recomendador = new RecomendadorAtuendos();

		List<Integer> temperaturas = new ArrayList<Integer>();
		temperaturas.add(20);
		temperaturas.add(40);
		
		Accesorio accesorio = new Accesorio(enumAccesorio.LENTES, "rojo", "verde", temperaturas);

		Assert.assertTrue(recomendador.checkearTemperatura(accesorio));
	}
	
	@Test
	public void casoLimite_unAccesorioDeVeranoSePuedeUsarEnVerano() {
		RecomendadorAtuendos recomendador = new RecomendadorAtuendos();

		List<Integer> temperaturas = new ArrayList<Integer>();
		temperaturas.add(22);
		temperaturas.add(40);
		
		Accesorio accesorio = new Accesorio(enumAccesorio.LENTES, "rojo", "verde", temperaturas);

		Assert.assertTrue(recomendador.checkearTemperatura(accesorio));
	}
	
	@Test(expected = RuntimeException.class)
	public void noPuedoUsarLaAPIMasDe10Veces() {
		RecomendadorAtuendos recomendador = new RecomendadorAtuendos();
		List<Integer> temperaturas = new ArrayList<Integer>();
		temperaturas.add(20);
		temperaturas.add(40);
		
		Accesorio accesorio = new Accesorio(enumAccesorio.LENTES, "rojo", "verde", temperaturas);
		ParteSuperior parteSuperior = new ParteSuperior(enumPARTESUPERIOR.BUZO,"lana", "rojo", "verde", temperaturas);
		ParteInferior parteInferior = new ParteInferior(enumPARTEINFERIOR.PANTALON,"lana", "rojo", "verde", temperaturas);;
		Calzado calzado = new Calzado(enumCALZADO.BOTAS,"lana", "rojo", "verde", temperaturas);;
		
		recomendador.sugerirAccesorio(accesorio);
		recomendador.sugerirParteSuperior(parteSuperior);
		recomendador.sugerirParteInferior(parteInferior);
		recomendador.sugerirCalzado(calzado);
		
		IntStream.rangeClosed(0, 10).forEach(i -> recomendador.sugerirAtuendo());
	}

}
