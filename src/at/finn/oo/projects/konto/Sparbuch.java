package at.finn.oo.projects.konto;

public class Sparbuch extends Konto
{
    private double interestRate;

    public Sparbuch(double interestRate) {
        this.interestRate = interestRate;
    }

    public void Zinsen()
    {
        double Credit = getCredit();
        Credit = Credit + (Credit * this.interestRate);
        setCredit(Credit);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
