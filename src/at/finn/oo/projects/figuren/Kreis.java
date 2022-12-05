package at.finn.oo.projects.figuren;

public class Kreis
{
    private double siteA;
    private String name;
    public Kreis(String name, double siteA)
    {
        this.name = name;
        this.siteA = siteA;
    }

    public void getArea()
    {
        final double pi = 3.14159265359;
        System.out.println("Area: " + siteA*pi);
    }
    public void name()
    {
        System.out.println("name: " + this.name);
    }

    public double getSiteA()
    {
        return siteA;
    }

    public String getName()
    {
        return name;
    }
}
