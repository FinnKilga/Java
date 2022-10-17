package objects;

public class Tire
{
    private int size; //durchmesser in cm
    public enum TYPE {Summer,Winter,Spikes}
    TYPE type;

    public Tire(int size, TYPE type)
    {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public TYPE getType() {
        return type;
    }
}
