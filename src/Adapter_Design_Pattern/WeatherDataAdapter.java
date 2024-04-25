package Adapter_Design_Pattern;

public class WeatherDataAdapter implements WeatherData {
    private WeatherData source;

    public WeatherDataAdapter(WeatherData source) {
        this.source = source;
    }

    @Override
    public String getCity() {
        return source.getCity();
    }

    @Override
    public String getTemperature() {
        return source.getTemperature();
    }

    @Override
    public String getDescription() {
        return source.getDescription();
    }

    @Override
    public String getHumidity() {
        return source.getHumidity();
    }

    @Override
    public String getWindSpeed() {
        return source.getWindSpeed();
    }
}

