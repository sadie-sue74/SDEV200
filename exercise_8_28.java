import java.util.Scanner;

public class exercise_8_28
{
    public static void main(String[] args) 
    {
        System.out.print("Please enter the first list (9 numbers): ");
        int[][] l1 = getArray();
        System.out.print("Please enter the second list (9 numbers): ");
        int[][] l2 = getArray();

        System.out.println("The two arrays are" + (match(l1, l2) ? " " : " not ") + "strictly identical.");
    }

    public static boolean match(int[][] m1, int[][] m2)
    {
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                if(m1[x][y] != m2[x][y])
                    return false;
            }
        }
        return true;
    }

    public static int[][] getArray()
    {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];
        for(int z = 0; z < m.length; z++)
        {
            for(int w = 0; w < m[z].length; w++)
            {
                m[z][w] = input.nextInt();
            }
        }
        return m;
    }

}