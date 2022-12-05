package at.finn.oo.projects.figuren;

public class Würfel extends Quadrat
{
    public Würfel(String name, double siteA)
    {
       super(name,siteA);
    }

    @Override
    public void getArea()
    {
        System.out.println("Area: " + 6*(getSiteA()*getSiteA()));
    }
}
