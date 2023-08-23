package SmartHome;

public class HumidifierFactory implements SmartHome {

    @Override
    public SelectType createType() {
        return new Humidifier();
    }
}
