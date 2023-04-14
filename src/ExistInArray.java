import java.util.Scanner;
import java.util.Random;

public class ExistInArray {
    public static void main(String[] args) {

        // Create variables
        int[] numbers = new int[10];
        boolean inArray = false;
        Random rand = new Random();
        Scanner reader = new Scanner((System.in));
        int value;

        // Set random numbers in array
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = rand.nextInt(10);
            System.out.println(numbers[i]);
        }

        // Ask user for value to check
        System.out.print("Please enter a whole number between 0 and 10: ");
        value = reader.nextInt();

        // Search array for value
        for (int i = 0; i < 10; i++)
        {
            if (numbers[i] == value)
            {
                inArray = true;
            }
        }

        // Print if value exists
        if(inArray)
        {
            System.out.printf("Value %d found in array", value);
        }
        else
        {
            System.out.println("Value was not found in array");
        }
    }
}
