package at.finn.oo.projects.rechner;
import java.util.*;

public class WissenschaftlicherRechner extends Rechner
{
    public void sinus(double degrees)
    {
        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);

        // prints the sine value
        System.out.println("sin(" + degrees + ") = " + sinValue);
    }
    public void cosinus(double degrees)
    {
        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double cosValue = Math.cos(radians);

        // prints the sine value
        System.out.println("cos(" + degrees + ") = " + cosValue);
    }
}
