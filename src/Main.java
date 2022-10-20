import objects.*;

public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine(79, Engine.TYPE.GAS);
        Engine e2 = new Engine(150, Engine.TYPE.DIESEL);
        Mirror m1 = new Mirror(100,0);
        Mirror m2 = new Mirror(80,-40);
        Tire t1 = new Tire(50, Tire.TYPE.Winter);
        Tire t2 = new Tire(50, Tire.TYPE.Summer);

        Car c1 = new Car("VW", "A2008", 5, e1);
        c1.setColor("red");
        c1.setFuelAmount(49);
        c1.setMaxFuelLevel(50);
        c1.addMirror(m1);
        c1.addMirror(m2);
        c1.addTire(t1);
        c1.addTire(t1);
        c1.addTire(t1);
        c1.addTire(t1);

        Car c2 = new Car("Mercedes", "M2004", 9,e2);
        c2.setColor("silver");
        c2.setFuelAmount(1);
        c2.setMaxFuelLevel(60);

        Car c3 = new Car("Kia", "B1200",5,e1);
        c3.setColor("silver");
        c3.setFuelAmount(55);
        c3.setMaxFuelLevel(55);


        Remote r1 = new Remote(100,100);
        r1.getStatus();
        r1.turnOn();
        r1.turnOff();
        r1.getStatus();
        r1.turnOn();
        r1.getStatus();
        r1.turnOn();
        r1.getStatus();
        r1.turnOn();
        r1.getStatus();
        r1.turnOn();
    }
}
