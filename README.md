# WeatherSearch
Service which will receive a request with the name of a city in the world, and you will have to return the temperature of this city in Celsius and Fahrenheit

Rest type service

Request of the service: 
The POST type was used for its quality of not showing the data sent in the url.
Request of the json type through the request body because it is a standardized text format.
Example: 
  {"city":"santiago"}

Response of the service:
Response of the json type to maintain the same standard as the input one and because it is an easily manipulable type.
Example:
  {
    "city": "Santiago",
    "minTempC": 11,
    "maxTempC": 18,
    "minTempF": 51.8,
    "maxTempF": 64.4
}

Frameworks:
  SpringFramework: Because of its ease of executing an serverless application, facilitating configurations and being a recognized construction standard and I consider it   the ideal for the development of microservices of the Rest type


Example to run the service:
- Put de .jar and de props file in the same folder.
- Open a CMD and CD to the .jar folder
- Run the command: java -jar WeatherSearch.jar
- Using Postman or other software of your choice paste the following url: http://localhost:4000/weather/search
- Write the request in the body and click "Send".
