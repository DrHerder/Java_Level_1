package Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class HW_Lesson_4
{
    public static char[][] map;
    public static final int SIZE = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args)
    {
        initMap();
        printMap();
        while(true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек!");
                break;
            }
            if(isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил компьютер!");
                break;
            }
            if(isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        for(int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");
            for(int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn()
    {
        Random random = new Random();
        int x;
        int y;

        do
        {
            x = random.nextInt(SIZE); // от 0 до 2 включительно
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) // проверяем невыбивание за границы
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }

        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }

        return false;
    }

    /*public static boolean checkWin(char symb)
    {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
        {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
        {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
        {
            return true;
        }

        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb)
        {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb)
        {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb)
        {
            return true;
        }

        if (map[0][0] == symb && map [1][1] == symb && map[2][2] == symb)
        {
            return true;
        }
        if (map[0][2] == symb && map [1][1] == symb && map[2][0] == symb)
        {
            return true;
        }
        return false;
    }*/

    public static boolean checkWin(char symb)
    {
        int counter = 0;
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (SIZE - 1 - i == j && map[i][j] == symb)
                {
                    counter++;
                }
            }
        }
        if(counter == SIZE)
        {
            return true;
        }
        else
        {
            counter = 0;
        }

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (i == j && map[i][j] == symb)
                {
                    counter++;
                }
            }
        }
        if(counter == SIZE)
        {
            return true;
        }
        else
        {
            counter = 0;
        }

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if(map[i][j] == symb)
                {
                    counter++;
                }
            }
            if(counter == SIZE)
            {
                return true;
            }
            else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[j][i] == symb)
                {
                    counter++;
                }
            }
            if(counter == SIZE)
            {
                return true;
            }
            else
            {
                counter = 0;
            }
        }
        return false;
    }

    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if(map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
