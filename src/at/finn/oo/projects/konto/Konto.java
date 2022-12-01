package at.finn.oo.projects.konto;

public class Konto
{
    private double credit;
    public void deposit(double money)
    {
        if (money >= 0)
        {
            this.credit += money;
        }
        else
        {
            System.out.println("Can't deposit a negative amount");
        }
    }
    public void withdraw(double money)
    {
        if (money >= 0)
        {
            this.credit -= money;
        }
        else
        {
            System.out.println("Can't withdraw a negative amount");
        }
    }
    public void credit()
    {
        System.out.println("Credit: " + this.credit);
    }

    public double getCredit()
    {
        return credit;
    }

    public void setCredit(double credit)
    {
        this.credit = credit;
    }
}
