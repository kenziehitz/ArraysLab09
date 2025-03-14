import java.util.Random;
import java.util.Scanner;
public class Lab09 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        System.out.print("Array Values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i == dataPoints.length - 1) {
                System.out.print(dataPoints[i]);
            } else {
                System.out.print(dataPoints[i] + " | ");
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = sum / (double) dataPoints.length;
        System.out.println("The sum if the array is: " + sum);
        System.out.println("\nAverage Value : " + average);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 100: ");
        int userValue = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times");
        System.out.print("Enter a number between 0 and 100: ");
        int searchValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                System.out.println("The value " + searchValue + " was found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + searchValue + " was not found");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        System.out.println("The average value is: " + average);
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / (double) values.length;
    }

}
