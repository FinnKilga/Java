package at.finn.oo.projects.konto;

public class Girokonto extends Sparbuch
{
    double Kosten;
    public Girokonto(double interestRate,double Kosten,double overdraftLimit)
    {
        super(interestRate,overdraftLimit);
        this.Kosten = Kosten;
    }

    public void kosten()
    {
        double Credit = getCredit();
        Credit -= this.Kosten;
        setCredit(Credit);
    }

}
