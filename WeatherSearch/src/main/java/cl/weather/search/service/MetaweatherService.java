package cl.weather.search.service;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import cl.weather.search.entities.ConsolidatedWeather;
import cl.weather.search.entities.Location;
import cl.weather.search.utils.Utils;

public class MetaweatherService {
	
	public Location getWOEID(String city) {
		
		Location location = new Location();
		List<Location> locationList = new ArrayList<Location>();
		OkHttpClient client = new OkHttpClient();
		
		HashMap<String, String> queryString = new HashMap<String, String>();
		queryString.put("query", city);
		
		String baseURL = Utils.getProperty("weather.service.woeid.url");
		String queryParams = Utils.mapToQueryString(queryString);
		
		String fullURL = baseURL.concat(queryParams);
		
		try {
			Request request = new Request.Builder()
					.url(fullURL)
			        .build();
			
			Response response = client.newCall(request).execute();
			
			if (response.isSuccessful()) {
				
				String jsonArray = response.body().string();
				locationList = Utils.locationParseJson(jsonArray);
				if(locationList.size() > 0) {
					location = locationList.get(0);
				}
			}
		}catch (IOException e) {
			System.out.println("Error al invocar el servicio metaweather: "+ e);
		}
		
		return location;
	}
	
	public ConsolidatedWeather getWeatherInfo(int woeid) {
		ConsolidatedWeather cw = new ConsolidatedWeather();
		OkHttpClient client = new OkHttpClient();
		
		List<ConsolidatedWeather> listCw = new ArrayList<ConsolidatedWeather>();
		
		String baseURL = Utils.getProperty("weather.service.location.url");
		String queryString = String.valueOf(woeid);
		
		String fullURL = baseURL.concat(queryString);
		
		try {
			Request request = new Request.Builder()
					.url(fullURL)
			        .build();
			
			Response response = client.newCall(request).execute();
			if (response.isSuccessful()) {
				String jsonResp = response.body().string();
				
				listCw = Utils.listTempInfoParseJson(jsonResp);
				cw = listCw.get(0);
				

			}
			
		}catch (IOException e) {
			System.out.println("Error al invocar Servicio metaweather: "+ e);
		}
		return cw;
	}
}
