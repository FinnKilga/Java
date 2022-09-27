import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        char[][] gamefield = new char[2][2];
        char player1 = 'X';
        char player2 = 'O';
        int playerSelection = 0;
        System.out.println("Mit diesem Programm kann man zu zweit Tic Tac Toe spielen");
        System.out.println("Spieler 1: X");
        System.out.println("Spieler 2: O");
        System.out.println("Gib immer Zeile und Spalte an!");
        int row = 0;
        int collumn = 0;
        boolean finish = false;
        boolean wrongEntry;
        while (finish)
        {
            do
            {
                System.out.println("Bitte gib die Zeile an");
                input = scanner.nextLine();
                row = input.charAt(0);
                System.out.println("Bitte gib die Spalte an");
                input = scanner.nextLine();
                collumn = input.charAt(0);
                if (gamefield[row][collumn] != null)
                {

                }
            }
            while (wrongEntry);

            if (playerSelection == 0)
            {
                gamefield[row][collumn] = 'X';
                playerSelection = 1;
            }
            else
            {
                gamefield[row][collumn] = 'O';
                playerSelection = 0;
            }
            finish = F_finish(gamefield);
        }
    }
    public static boolean F_finish(char[][] gamefield = new char[2][2])
    {
        if (gamefield[0][0] == 'X' && gamefield[0][1] == 'X' && gamefield[0][2]) == 'X')
        {
            return true;
        }
    }
}
