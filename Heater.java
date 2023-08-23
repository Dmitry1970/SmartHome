package SmartHome;

public class Heater implements SelectType {

    @Override
    public int execute(int value, House house) {
        return house.getTemperature() + value;
    }
}

