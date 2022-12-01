import at.finn.oo.projects.rechner.Rechner;
import at.finn.oo.projects.rechner.WissenschaftlicherRechner;
import at.finn.oo.projects.rechner.Wurzelrechner;

public class Main
{
    public static void main(String[] args)
    {
        WissenschaftlicherRechner wr = new WissenschaftlicherRechner();
        wr.sinus(45);
        Wurzelrechner w = new Wurzelrechner();
        w.Wurzelziehen(25,2);
        w.subtraction(5,9);
        Rechner r = new Rechner();
        r.multiplication(80,0.5);
    }
}
