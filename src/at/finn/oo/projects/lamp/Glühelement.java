package at.finn.oo.projects.lamp;

public class Glühelement
{
    private String name;
    private String color;
    private int stromverbrauch;
    private boolean status;
    public Glühelement(String name,String color,int stromverbrauch,boolean status)
    {
        this.name = name;
        this.color = color;
        this.stromverbrauch = stromverbrauch;
        this.status = status;
    }
}
