import import java.util.Scanner;
import java.util.Random;

public class wuerfelspiel
{
   public static void main(String[] args)
   {
      String sInput;
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      char cswitch;
      do
      {
         System.out.println("Mit diesem Programm koennen Sie gegen den Computer Wuerfeln!");
         System.out.println("Druecken Sie bitte 's' fuer start oder 'b' fuer beenden");
         sInput = scanner.nextLine();
         cswitch = sInput.charAt(0);
         switch (cswitch)
         {
            case 's':
               int rand = random.nextInt(30);
               rand += 6;
               int wuerfel = 0;
               for(int i = 0;i<6;i++)
               {
                  int r = random.nextInt(6);
                  wuerfel += r;
                  System.out.println("Ihr Wuerfelergebnis: "+ r);

               }
               System.out.println("Ihr Endergebnis: "+ wuerfel);
               System.out.println("Das Wuerfelergebnis des Computers: "+ rand);
               if (rand < wuerfel)
               {
                  System.out.println("Sie haben gewonnen!");
               }
               else if (rand > wuerfel)
               {
                  System.out.println("Sie haben leider verloren!");
               }
               else
               {
                  System.out.println("Es ist ein Unentschieden!");
               }
               break;
            case 'b':
               System.out.println("Einen schoenen Tag noch!");
               break;
            default:
               System.out.println("Bitte geben Sie 's' oder 'b' ein!");
         }

      }
      while(cswitch != 'b');
   }
}
