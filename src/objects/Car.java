package objects;

public class Car
{
    private double fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private double fuelConsumption;
    private double maxFuelLevel;

//method
    public Car(String brand, String serialNumber, double fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
        this.serialNumber = serialNumber;
        this.brand = brand;
    }
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
    public void honk(int amountOfRepetitions)
    {
        int amount = 0;
        while (amount < amountOfRepetitions)
        {
            System.out.println("Tuuut");
            amount += 1;
        }
    }
    public void getRemainingRange()
    {
        System.out.println("You can drive " + Math.floor(fuelAmount/this.fuelConsumption) + " times");
    }
//set
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption)
    {
        if (fuelConsumption < 2)
        {
            this.fuelConsumption = 2;
        }
        else
        {
            this.fuelConsumption = fuelConsumption;
        }
    }

    public void setMaxFuelLevel(double maxFuelLevel)
    {
        if (maxFuelLevel > 100)
        {
            this.maxFuelLevel = 100;
        }
        else
        {
            this.maxFuelLevel = maxFuelLevel;
        }
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    //get

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }
}
