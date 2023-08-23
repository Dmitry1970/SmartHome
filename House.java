package SmartHome;

public class House {

    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public House(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
