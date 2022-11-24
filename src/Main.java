import at.finn.oo.projects.cars.Car;
import at.finn.oo.projects.cars.Engine;
import at.finn.oo.projects.cars.Hersteller;
import at.finn.oo.projects.lamp.Gluhelement;
import at.finn.oo.projects.lamp.Lamp;

public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine (Engine.TYPE.Gas,80);
        Engine e2 = new Engine (Engine.TYPE.Diesel,300);
        Hersteller pirker = new Hersteller("Pirker","Austria",20);
        Hersteller audi = new Hersteller("audi","Germany",5);
        Car c1 = new Car("red",175,20000,5,e1);
        Car c2 = new Car("black",500,100000,10,e2);


        Gluhelement g1 = new Gluhelement("g1","red",10,false);
        Gluhelement g2 = new Gluhelement("g2","blue",15,false);
        Gluhelement g3 = new Gluhelement("g3","white",5,true);

        Lamp l1 = new Lamp();
        l1.addLightElement(g1);
        l1.addLightElement(g2);
        l1.addLightElement(g3);

        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        l1.turnAllOff();

    }
}
