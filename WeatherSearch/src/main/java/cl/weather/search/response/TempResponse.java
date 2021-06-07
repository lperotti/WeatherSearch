package cl.weather.search.response;

import cl.weather.search.entities.TempInformation;

public class TempResponse extends Response{

	private TempInformation tempInformation;

	public TempInformation getTempInformation() {
		return tempInformation;
	}

	public void setTempInformation(TempInformation tempInformation) {
		this.tempInformation = tempInformation;
	}
	
	

}
