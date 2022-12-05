import at.finn.oo.projects.figuren.Kreis;
import at.finn.oo.projects.figuren.Quadrat;
import at.finn.oo.projects.figuren.Würfel;
import at.finn.oo.projects.konto.Girokonto;
import at.finn.oo.projects.konto.Konto;
import at.finn.oo.projects.konto.Kreditkonto;
import at.finn.oo.projects.konto.Sparbuch;
import at.finn.oo.projects.rechner.Rechner;
import at.finn.oo.projects.rechner.WissenschaftlicherRechner;
import at.finn.oo.projects.rechner.Wurzelrechner;

public class Main
{
    public static void main(String[] args)
    {
        Kreis k1 = new Kreis("Kreis 1",8);
        Quadrat q1 = new Quadrat("Quader 1",5);
        q1.getName();
        q1.getArea();
        Würfel w1 = new Würfel("Würfel 1",5);
        w1.getArea();
    }
}
