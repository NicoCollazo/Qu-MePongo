package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimaAccuWeather implements AdapterClima{
	AccuWeatherAPI APIclima = new AccuWeatherAPI();
	List<Map<String, Object>> condicionesClimaticas = APIclima.getWeather("Buenos Aires, Argentina"); 
	
	public HashMap<String, Object> getTemperatura() {
		return (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
	}
}
