package objects;

public class Remote
{
    private int battery_1;
    private int battery_2;
    public Remote(int battery_1,int battery_2)
    {
        this.battery_1 = battery_1;
        this.battery_2 = battery_2;
    }
    public void getStatus()
    {
        System.out.println("Battery status: "+(this.battery_1 + this.battery_2) / 2 + "%");
    }
    public void turnOn()
    {
        this.battery_1 = this.battery_1 - (this.battery_1 / 100 * 5);
        this.battery_2 = this.battery_2 - (this.battery_2 / 100 * 5);
        System.out.println("Verbraucher angeschlossen");
    }
    public void turnOff()
    {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
