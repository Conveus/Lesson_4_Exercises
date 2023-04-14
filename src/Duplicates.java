import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {

        // Create variables
        Random rand= new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Set random numbers in array
        for (int i = 0; i < 10; i++)
        {
            array1[i] = rand.nextInt(20)+1;
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            array2[i] = rand.nextInt(20)+1;
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        // Print any numbers found in both arrays
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(array1[i] == array2[j])
                {
                    System.out.printf("The number %d is found in both arrays", array1[i]);
                    System.out.println();
                }
            }
        }

    }
}
