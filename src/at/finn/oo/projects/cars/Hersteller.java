package at.finn.oo.projects.cars;

public class Hersteller
{
    public String name;
    public String Herkunftsland;
    public int rabatt;
    public Hersteller(String name,String Herkunftsland,int rabatt)
    {
        this.name = name;
        this.Herkunftsland = Herkunftsland;
        this.rabatt = rabatt;
    }

    public void setHerkunftsland(String herkunftsland) {
        Herkunftsland = herkunftsland;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRabatt(int rabatt) {
        this.rabatt = rabatt;
    }

    public int getRabatt() {
        return rabatt;
    }

    public String getHerkunftsland() {
        return Herkunftsland;
    }

    public String getName() {
        return name;
    }
}

