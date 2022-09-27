import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        char[][] gamefield = new char[2][2];
        int row;
        int col;
        boolean finish = false

        System.out.println("Mit diesem Programm kann man TicTacToe spielen");

        while (!finish)
        {
            System.out.println("Bitte gib die Zeile an");
            input = scanner.nextLine();
            row = input.charAt(0);
            System.out.println("Bitte gib die Spalte an");
            input = scanner.nextLine();
            col = input.charAt(0);
        }
    }

}
