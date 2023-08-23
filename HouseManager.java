package SmartHome;

/*
Умный дом

1) Реализовать класс House с параметрами: температура, влажность.
2) Добавить классы Humidifier и Heater с методом execute(int value, House house),
который увеличивает влажность либо температуру в доме на value
2) Написать класс HouseManager, который вызывает метод execute(int value, House house)
у объектов Humidifier или  Heater , в результате увеличивается температура в доме на value (объекте класса House)
4) Реализовать программу через паттерн Factory Method так, чтобы HouseManager не зависел от Heater и Humidifier
и можно было легко добавлять новые классы для обслуживания дома.
*/

public abstract class HouseManager {



    public static void main(String[] args) {
        ParameterTypes types = ParameterTypes.HUMIDITY;
        ParameterTypes types1 = ParameterTypes.TEMPERATURE;
        House house = new House(20, 75);
        SmartHome smartHome = chooseType(types1);
        SelectType selectType = smartHome.createType();
        System.out.println(selectType.execute(15, house));
    }

    public static SmartHome chooseType(ParameterTypes type) {
        switch (type) {
            case TEMPERATURE:
                return new HeaterFactory();
            case HUMIDITY:
                return new HumidifierFactory();
            default:
                throw new RuntimeException(type + "Выберите правильный параметр");
        }
    }
}
