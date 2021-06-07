package cl.weather.search.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.weather.search.entities.ConsolidatedWeather;
import cl.weather.search.entities.Location;
import cl.weather.search.entities.TempInformation;
import cl.weather.search.request.Request;
import cl.weather.search.response.TempResponse;
import cl.weather.search.service.MetaweatherService;

@RestController
public class Controller {

	@PostMapping(value = "search",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TempResponse weatherSearch(@RequestBody Request city) {
		TempResponse resp = new TempResponse();
		TempInformation ti = new TempInformation();
		MetaweatherService metaweatherService = new MetaweatherService();
		
		Location location = metaweatherService.getWOEID(city.getCity());
		
		if(location.getWoeid() > 0) {
			ConsolidatedWeather cw = metaweatherService.getWeatherInfo(location.getWoeid());
			
			ti.setCity(location.getTitle());
			ti.setMinTempC((int) cw.getMin_temp());
			ti.setMaxTempC((int) cw.getMax_temp());
			
			double minTempF = (cw.getMin_temp() * 1.8) + 32;
			double maxTempF = (cw.getMax_temp() * 1.8) + 32;
			
			ti.setMinTempF(minTempF);
			ti.setMaxTempF(maxTempF);
			
			resp.setCode(0);
			resp.setMessage("City information found");
			resp.setTempInformation(ti);
		}else {
			resp.setCode(1);
			resp.setMessage("City not found");
		}

		
		
		return resp;
		
	}
}
