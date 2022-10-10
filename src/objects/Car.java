package objects;

public class Car
{
    public double fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public double fuelConsumption;
    public double maxFuelLevel;

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
        double tank = this.fuelAmount/this.maxFuelLevel*100;
        if (tank > 10)
        {
            System.out.println("SuperBoostMode activated");
        }
        else
        {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
}
