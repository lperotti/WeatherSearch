package cl.weather.search.entities;

public class TempInformation {
	private String city;
	private int minTempC;
	private int maxTempC;
	private double minTempF;
	private double maxTempF;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMinTempC() {
		return minTempC;
	}

	public void setMinTempC(int minTempC) {
		this.minTempC = minTempC;
	}

	public int getMaxTempC() {
		return maxTempC;
	}

	public void setMaxTempC(int maxTempC) {
		this.maxTempC = maxTempC;
	}

	public double getMinTempF() {
		return minTempF;
	}

	public void setMinTempF(double minTempF) {
		this.minTempF = minTempF;
	}

	public double getMaxTempF() {
		return maxTempF;
	}

	public void setMaxTempF(double maxTempF) {
		this.maxTempF = maxTempF;
	}
}
