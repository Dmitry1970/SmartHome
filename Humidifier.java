package SmartHome;

public class Humidifier implements SelectType {

    @Override
    public int execute(int value, House house) {
        return house.getHumidity() + value;
    }
}
