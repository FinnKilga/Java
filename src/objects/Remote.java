package objects;

public class Remote
{
    private double battery_1;
    private double battery_2;
    public Remote(double battery_1,double battery_2)
    {
        this.battery_1 = battery_1;
        this.battery_2 = battery_2;
    }
    public void getStatus()
    {
        System.out.println("Battery status: "+(this.battery_1 + this.battery_2) / 2 + "%");
        System.out.println("Battery 1 status: "+this.battery_1+ "%");
        System.out.println("Battery 2 status: "+this.battery_2+ "%");
    }
    public void turnOn()
    {
        this.battery_1 = this.battery_1 - this.battery_1 / 100 * 5;
        this.battery_2 = this.battery_2 - this.battery_2 / 100 * 5;
        System.out.println("Verbraucher angeschlossen");
    }
    public void turnOff()
    {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
