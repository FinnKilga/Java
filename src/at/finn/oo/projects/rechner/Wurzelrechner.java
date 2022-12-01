package at.finn.oo.projects.rechner;

public class Wurzelrechner extends Rechner
{
    public void Wurzelziehen(double number,double wurzel)
    {
        wurzel = 1/wurzel;
        System.out.println("Wurzel:" + Math. pow(number,wurzel));
    }
}
