package at.finn.oo.projects.cars;

public class Car
{
    private String color;
    private int maxSpeed;
    private double price;
    private int fuelConsumption;

    public void Car (String color,int maxSpeed,double price,int fuelConsumption)
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption()
    {
        return fuelConsumption;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
}
