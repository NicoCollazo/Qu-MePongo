package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimaAccuWeather implements AdapterClima{
	AccuWeatherAPI APIclima = new AccuWeatherAPI();
	List<Map<String, Object>> condicionesClimaticas = APIclima.getWeather("Buenos Aires, Argentina"); 
	
	public int getTemperatura() {
		HashMap<String, Object> temperaturaActual = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
		Integer grados = (int)temperaturaActual.get("Value"); 
		
		if(((String)temperaturaActual.get("Unit")).equals("F")) {
			return grados - 32; //Resto 32 para que sea en Celsius			
		}
		
		return grados;
	}
}
