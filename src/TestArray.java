import java.util.Random;

public class TestArray {
    public static void main(String[] args) {

        // Create variables
        int sum = 0;
        double average;
        Random rand = new Random();
        int[] numbers = new int[10];

        // Set random numbers in array
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = rand.nextInt(10);
            System.out.println(numbers[i]);
        }

        // Calculate sum of array
        for (int i = 0; i < 10; i++)
        {
            sum += numbers[i];
        }

        System.out.println(sum);

        // Calculate average
        average = sum / 10f;
        System.out.println(average);
    }
}
