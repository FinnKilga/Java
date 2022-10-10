import objects.Car;

public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car("VW", "A2008", 5);
        c1.setColor("red");
        c1.setFuelAmount(49);
        c1.setMaxFuelLevel(50);

        Car c2 = new Car("Mercedes", "M2004", 9);
        c2.setColor("silver");
        c2.setFuelAmount(1);
        c2.setMaxFuelLevel(60);

        Car c3 = new Car("Kia", "B1200",5);
        c3.setColor("silver");
        c3.setFuelAmount(55);
        c3.setMaxFuelLevel(55);
    }

}
