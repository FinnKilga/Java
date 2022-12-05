package at.finn.oo.projects.figuren;

public class Viereck extends Kreis
{
    private double siteB;
    public Viereck(String name, double siteA,double siteB)
    {
        super(name, siteA);
        this.siteB = siteB;
    }

    @Override
    public void getArea()
    {
        System.out.println("Area: " + this.siteB * getSiteA());
    }
}
