## Умный дом

1) Реализовать класс House с параметрами: температура, влажность.
2) Добавить классы Humidifier и Heater с методом execute(int value, House house), который увеличивает влажность либо температуру в доме на value
2) Написать класс HouseManager, который вызывает метод execute(int value, House house) у объектов Humidifier или  Heater , в результате увеличивается температура в доме на value (объекте класса House)
4) Реализовать программу через паттерн Factory Method так, чтобы HouseManager не зависел от Heater и Humidifier
   и можно было легко добавлять новые классы для обслуживания дома.