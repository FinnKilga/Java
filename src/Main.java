import at.finn.oo.projects.cars.Car;
import at.finn.oo.projects.cars.Engine;
import at.finn.oo.projects.cars.Hersteller;

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

        c1.buy(pirker);
        c1.buy((audi));

        c1.drive(49000);
        c1.drive(50000);


    }
}
