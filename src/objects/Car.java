package objects;

public class Car
{
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int fuelConsumption;
    public int maxFuelLevel;

    public void drive()
    {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }
    public void Break()
    {
        System.out.println("Ich bremse");
    }
    public void turboBoost()
    {
        int tank = this.fuelAmount/this.maxFuelLevel*100;
        if (tank > 10)
        {
            System.out.println("SuperBoostMode");
        }
        else
        {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
}
