package Adapter_Design_Pattern;

public class MobileApplication {
    public static void main(String[] args) {
        WeatherAPI1Data weatherAPI1Data = new WeatherAPI1Data("Almaty", "25°C", "Sunny", "60%", "10 km/h");
        WeatherData adapter1 = new WeatherDataAdapter(weatherAPI1Data);

        WeatherAPI2Data weatherAPI2Data = new WeatherAPI2Data("Aktau", "20°C", "Cloudy", "70%", "15 km/h");
        WeatherData adapter2 = new WeatherDataAdapter(weatherAPI2Data);

        displayWeather(adapter1);
        displayWeather(adapter2);
    }

    public static void displayWeather(WeatherData weatherData) {
        System.out.println("City: " + weatherData.getCity());
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Description: " + weatherData.getDescription());
        System.out.println("Humidity: " + weatherData.getHumidity());
        System.out.println("Wind Speed: " + weatherData.getWindSpeed());
        System.out.println();
    }
}
