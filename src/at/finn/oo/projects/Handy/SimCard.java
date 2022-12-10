package at.finn.oo.projects.Handy;

public class SimCard
{
    private String id;
    private String number;
    public SimCard(String id,String number)
    {
        this.id = id;
        this.number = number;
    }
    public void doCall(String number)
    {
        System.out.println("calling " + number);
    }
}
