import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {

        // Create variables
        Random rand = new Random();
        int[] numbers = new int[10];
        int min = 10;
        int max = 1;

        // Set random numbers in array
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = rand.nextInt(10)+1;
            System.out.println(numbers[i]);
        }

        // Find min and max number in array
        for (int i = 0; i < 10; i++)
        {
            if (max < numbers[i])
            {
                max = numbers[i];
            }
            if (min > numbers[i])
            {
                min = numbers[i];
            }
        }

        // Print result
        System.out.printf("The maximum number is %d and the minimum number is %d", max, min);


    }
}
