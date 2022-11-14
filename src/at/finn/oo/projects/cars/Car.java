package at.finn.oo.projects.cars;

public class Car
{
    private String color;
    private int maxSpeed;
    private double price;
    private int fuelConsumption;
    private Engine engine;

    public Car(String color,int maxSpeed,double price,int fuelConsumption,Engine engine)
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.engine = engine;

    }
    public void buy(Hersteller h)
    {
        double endPrice;
        endPrice = this.price - this.price * h.rabatt/100;
        System.out.println("Das Auto kostet ohne Rabatt " + this.price);
        System.out.println("Das Auto kostet nach Abzug des Rabattes noch " + endPrice);
    }
    public void drive(int kilometeranzahl)
    {
        double fuelConsumptionNew;
        double fuelConsumptionAusgabe;
        //Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.
        if (kilometeranzahl < 50000)
        {
            System.out.println("Das Auto verbraucht " + this.fuelConsumption * kilometeranzahl + " L.");
        }
        else
        {
            fuelConsumptionAusgabe = kilometeranzahl * this.fuelConsumption;
            kilometeranzahl -= 50000;
            fuelConsumptionNew = this.fuelConsumption + (this.fuelConsumption * 0.098);
            fuelConsumptionAusgabe += kilometeranzahl * fuelConsumption;
            System.out.println("Das Auto verbraucht " + fuelConsumptionAusgabe + " L.");
        }
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
