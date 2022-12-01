package at.finn.oo.projects.rechner;

public class Rechner
{
    public void addition(double a,double b)
    {
        System.out.println("addition: " + a+b);
    }
    public void subtraction(double a, double b)
    {
        double subtraction = a-b;
        System.out.println("subtraction: " + subtraction);
    }
    public void multiplication(double a,double b)
    {
        System.out.println("multiplication: " + a*b);
    }
    public void division(double a,double b)
    {
        if (b==0)
        {
            System.out.println("The second number is not allowed to be zero!");
        }
        else
        {
            System.out.println("division: " + a/b);
        }
    }
}
