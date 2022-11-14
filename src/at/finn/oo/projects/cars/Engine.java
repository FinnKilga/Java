package at.finn.oo.projects.cars;

public class Engine
{
    public enum TYPE{Gas, Diesel};
    private TYPE type;
    private int horsepower;

    public Engine(TYPE type,int horsepower)
    {
        this.type = type;
        this.horsepower = horsepower;
    }
}

