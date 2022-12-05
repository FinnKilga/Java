package at.finn.oo.projects.konto;

public class Konto
{
    private double credit;
    private double overdraftLimit;
    public Konto(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }
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
    public void withdrawal(double money)
    {
        if (money >= 0)
        {
            if (this.credit - money < this.overdraftLimit)
            {
                System.out.println("You can't go over the limit of " + this.overdraftLimit);
            }
            else
            {
                this.credit -= money;
            }
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
