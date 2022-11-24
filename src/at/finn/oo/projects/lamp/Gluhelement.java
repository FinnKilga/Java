package at.finn.oo.projects.lamp;

public class Gluhelement
{
    private String name;
    private String color;
    private int stromverbrauch;
    private boolean status;
    public Gluhelement(String name,String color,int stromverbrauch,boolean status)
    {
        this.name = name;
        this.color = color;
        this.stromverbrauch = stromverbrauch;
        this.status = status;
    }
    public void turnOn()
    {
        if (this.status == false)
        {
            this.status = true;
            this.stromverbrauch += 5;
            System.out.println("Turned on");
        }
        else
        {
            System.out.println("My Name is " + this.name + " I'm already on");
        }
    }
    public void turnOff()
    {
        this.status = false;
    }

    public int getStromverbrauch()
    {
        return stromverbrauch;
    }

    public String getName()
    {
        return name;
    }
}
