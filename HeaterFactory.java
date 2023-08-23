package SmartHome;

public class HeaterFactory implements SmartHome {

    @Override
    public SelectType createType() {
        return new Heater();
    }
}
