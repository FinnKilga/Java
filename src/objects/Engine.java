package objects;

public class Engine
{
    public enum TYPE {DIESEL, GAS};
    private int horsepower;
    private TYPE type; //Diesel oder Benzin

    public Engine (int horsepower, TYPE type)
    {
        this.horsepower = horsepower;
        this.type = type;
    }
    /*
    amount should be between 0 and 100
     */
    public void drive (int amount)
    {
        System.out.println("the motor is running with" + amount);
    }

    public int getHorsepower()
    {
        return horsepower;
    }

    public TYPE getType()
    {
        return type;
    }
}
