package at.finn.oo.projects.lamp;
import at.finn.oo.projects.lamp.Gluhelement;
import java.util.ArrayList;

public class Lamp
{
    private ArrayList<Gluhelement> gluhelemente = new ArrayList<Gluhelement>();

    public void addLightElement(Gluhelement lämpchen)
        {
            this.gluhelemente.add(lämpchen);
        }
    public void turnAllOn()
    {
        for (int i = 0; i < this.gluhelemente.size(); i++)
        {
            this.gluhelemente.get(i).turnOn();
        }
    }
    public void turnAllOff()
    {
        for (int i = 0; i < this.gluhelemente.size(); i++)
        {
            this.gluhelemente.get(i).turnOff();
        }
        System.out.println("All lights are turned off");
    }
    public void getOverallPowerUsage()
    {
        double stromverbrauch = 0;
        for (int i = 0; i < this.gluhelemente.size(); i++)
        {
            stromverbrauch += this.gluhelemente.get(i).getStromverbrauch();
        }
        System.out.println("Es wurde bisher " + stromverbrauch + " verbraucht");
    }
    public void printNamesOfLightElements()
    {
        for (int i = 0; i < gluhelemente.size(); i++)
        {
            System.out.println("My name is " + this.gluhelemente.get(i).getName());
        }
    }
}

