package at.finn.oo.projects.Musicbox;

public class Title
{
    private double length;
    private String name;

    public Title(double length, String name)
    {
        this.length = length;
        this.name = name;
    }

    public double getLength()
    {
        return length;
    }

    public String getName()
    {
        return name;
    }
}
