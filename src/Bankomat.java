import java.util.Scanner;
public class Bankomat
{
    public static void main(String[] args)
    {
        float fguthaben = 0;
        char cswitch;
        String sInput;
        Scanner scanner= new Scanner(System.in);
        do
        {
            System.out.println("Bitte waehlen Sie eine der folgenden Moeglichkeiten:");
            System.out.println("Einzahlen (e)");
            System.out.println("Abheben (a)");
            System.out.println("Kontostand (k)");
            System.out.println("Beenden (b)");
            sInput = scanner.nextLine();
            cswitch = sInput.charAt(0);

            switch (cswitch)
            {
                case 'e':
                    System.out.println("Wie viel moechten Sie einzahlen?");
                    sInput = scanner.nextLine();
                    fguthaben += Float.parseFloat(sInput);
                    System.out.println("Ihr neuer Kontostand nach Transaktion:" + fguthaben + "€");
                    break;
                case 'a':
                    System.out.println("Wie viel moechten Sie abheben?");
                    sInput = scanner.nextLine();
                    fguthaben -= Float.parseFloat(sInput);
                    System.out.println("Ihr neuer Kontostand nach Transaktion:" + fguthaben + "€");
                    break;
                case 'k':
                    System.out.println("Sie haben auf ihrem Konto " + fguthaben + "€ Guthaben");
                    break;
                case 'b':
                    System.out.println("Einen schoenen Tag noch!");
                    break;
                default:
                    System.out.println("Bitte geben Sie einen der angegebenen Buchstaben ein!");
            }
            System.out.println("");
        }
        while(cswitch!='b');
    }
}