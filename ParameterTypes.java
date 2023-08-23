package SmartHome;

public enum ParameterTypes {

    TEMPERATURE("температура"),
    HUMIDITY("влажность");

    private String description;

    ParameterTypes(String description) {
        this.description = description;
    }
}
