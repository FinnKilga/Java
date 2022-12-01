package at.finn.oo.projects.konto;

public class Girokonto extends Sparbuch
{
    double Kosten;
    public Girokonto(double interestRate,double Kosten)
    {
        super(interestRate);
        this.Kosten = Kosten;
    }

    public void Kosten()
    {
        double Credit = getCredit();
        Credit -= this.Kosten;
        setCredit(Credit);
    }

}
