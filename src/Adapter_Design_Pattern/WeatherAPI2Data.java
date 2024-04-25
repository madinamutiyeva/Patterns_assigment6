package Adapter_Design_Pattern;

public class WeatherAPI2Data implements WeatherData {
    private String city;
    private String temperature;
    private String description;
    private String humidity;
    private String windSpeed;
    public WeatherAPI2Data(String city, String temperature, String description, String humidity, String windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getTemperature() {
        return temperature;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getHumidity() {
        return humidity;
    }

    @Override
    public String getWindSpeed() {
        return windSpeed;
    }
}
