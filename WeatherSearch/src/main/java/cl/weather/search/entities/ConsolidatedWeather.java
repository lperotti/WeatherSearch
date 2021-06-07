package cl.weather.search.entities;

public class ConsolidatedWeather {
	private int id;
	private String weather_state_name;
	private String weather_state_abbr;
	private String wind_direction_compass;
	private String created;
	private String applicable_date;
	private long min_temp;
	private long max_temp;
	private long the_temp;
	private long wind_speed;
	private long wind_direction;
	private long air_pressure;
	private int humidity;
	private long visibility;
	private long predictability;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeather_state_name() {
		return weather_state_name;
	}

	public void setWeather_state_name(String weather_state_name) {
		this.weather_state_name = weather_state_name;
	}

	public String getWeather_state_abbr() {
		return weather_state_abbr;
	}

	public void setWeather_state_abbr(String weather_state_abbr) {
		this.weather_state_abbr = weather_state_abbr;
	}

	public String getWind_direction_compass() {
		return wind_direction_compass;
	}

	public void setWind_direction_compass(String wind_direction_compass) {
		this.wind_direction_compass = wind_direction_compass;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getApplicable_date() {
		return applicable_date;
	}

	public void setApplicable_date(String applicable_date) {
		this.applicable_date = applicable_date;
	}

	public long getMin_temp() {
		return min_temp;
	}

	public void setMin_temp(long min_temp) {
		this.min_temp = min_temp;
	}

	public long getMax_temp() {
		return max_temp;
	}

	public void setMax_temp(long max_temp) {
		this.max_temp = max_temp;
	}

	public long getThe_temp() {
		return the_temp;
	}

	public void setThe_temp(long the_temp) {
		this.the_temp = the_temp;
	}

	public long getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(long wind_speed) {
		this.wind_speed = wind_speed;
	}

	public long getWind_direction() {
		return wind_direction;
	}

	public void setWind_direction(long wind_direction) {
		this.wind_direction = wind_direction;
	}

	public long getAir_pressure() {
		return air_pressure;
	}

	public void setAir_pressure(long air_pressure) {
		this.air_pressure = air_pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	public long getPredictability() {
		return predictability;
	}

	public void setPredictability(long predictability) {
		this.predictability = predictability;
	}

}
