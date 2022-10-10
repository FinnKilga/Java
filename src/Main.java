import objects.Car;

public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.brand = "VW";
        c1.fuelConsumption = 5;
        c1.fuelAmount = 49;
        c1.serialNumber = "A2008";
        c1.color = "red";
        c1.maxFuelLevel = 50;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 9;
        c2.fuelAmount = 1;
        c2.serialNumber = "M2004";
        c2.color = "silver";
        c2.maxFuelLevel = 60;

        c1.turboBoost();
        c2.turboBoost();

    }

}
