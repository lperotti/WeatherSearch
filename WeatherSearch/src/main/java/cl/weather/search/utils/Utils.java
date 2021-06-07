package cl.weather.search.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import cl.weather.search.entities.ConsolidatedWeather;
import cl.weather.search.entities.Location;

import java.util.Properties;

public class Utils {
	
	public static String getProperty(String property) {
		
		Properties prop = new Properties();
		
		try {
			InputStream input = new FileInputStream("application.properties");
			prop.load(input);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error, Archivo de propiedades no encontrado: "+ e);
		} catch (IOException e) {
			System.out.println("Error al leer archivo de propiedades: "+ e);
		}
		
		return prop.getProperty(property);
	}
	
	public static String mapToQueryString(Map<String, String> map) {
	    StringBuilder string = new StringBuilder();

	    if(map.size() > 0) {
	        string.append("?");
	    }

	    int index=0;
	    for(Entry<String, String> entry : map.entrySet()) {
	    	index ++;
	        string.append(entry.getKey());
	        string.append("=");
	        string.append(entry.getValue());
	        if(index > map.size()) {
		        string.append("&");
	        }
	    }

	    return string.toString();
	}
	
	public static List<Location> locationParseJson (String json){
		Gson g = new Gson();
		Type type = new TypeToken<List<Location>>(){}.getType();
		return g.fromJson(json, type);
	}
	public static List<ConsolidatedWeather> listTempInfoParseJson(String json){
		Gson g = new Gson();
		JsonObject convertedObject = new Gson().fromJson(json, JsonObject.class);
		Type type = new TypeToken<List<ConsolidatedWeather>>(){}.getType();
		return g.fromJson(convertedObject.get("consolidated_weather"), type);
	}
}
