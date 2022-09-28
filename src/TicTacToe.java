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
        int playerSelection = 0;
        char symbol;
        boolean finish = false;
        boolean inputCheck = false;

        do
        {
            if (playerSelection == 0)
            {
                System.out.println("player 1:");
            }
            else
            {
                System.out.println("player 2:");
            }
            do {
                do {
                    System.out.println("Bitte gib die Zeile an");
                    input = scanner.nextLine();
                    row = Integer.parseInt(input);
                    row -= 1;
                    System.out.println(row);
                    if (row < 0 || row > 3) {
                        System.out.println("Bitte gib eine Zahl von 1-3 an");
                        inputCheck = true;
                    }
                }
                while (inputCheck);
                inputCheck = false;
                do {
                    System.out.println("Bitte gib die Spalte an");
                    input = scanner.nextLine();
                    col = Integer.parseInt(input);
                    col -= 1;
                    if (col < 0 || col > 3) {
                        System.out.println("Bitte gib eine Zahl von 1-3 an");
                        inputCheck = true;
                    }
                }
                while (inputCheck);
                if (gamefield[row][col] == null) //wenn leer, dann soll Zeile und Spalte neu eingegeben werden
                                                //operand geht nicht mit array?
                {
                    inputCheck = true;
                }
            }
            while (inputCheck);

            if (playerSelection == 0)
            {
                playerSelection = 1;
                symbol = 'X';
            }
            else
            {
                playerSelection = 0;
                symbol = 'O';
            }

            gamefield[row][col] = symbol;

            for (int r = 0; r < 3; r++)
            {
                for (int c = 0; c < 3; c++)
                {
                    try
                    {
                        System.out.println(gamefield[r][c]);
                    }
                    finally
                    {
                        System.out.println(" ");
                    }

                }
                System.out.println();
            }
        }
        while (!finish);

    }
}
