//Roxas, Hernani Roy
//CITCS 1B-B
import java.util.Scanner;
public class WeatherData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[][] temperatures = new double[3][7]; //2D array to store readings for 3 cities with 7 days each
        double[] highest = new double[3];
        double[] average = new double[3];
        double total = 0;
        
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.println("Enter temperature for city " + (row + 1) + " on day " + (column + 1) + ":");
                temperatures[row][column] = userInput.nextDouble();
                total += temperatures[row][column];
                
                if (temperatures[row][column] > highest[row]) { //finds the highest temperature
                    highest[row] = temperatures[row][column];
                }
            }

            average[row] = total / 7; //calculates average temperature
            total = 0;
        }

        for (int resultRow = 0; resultRow < 3; resultRow++) {
            System.out.printf("The average temperature for city %d is: %.2f degrees Celsius\n", (resultRow + 1), average[resultRow]);
            System.out.printf("The highest temperature for city %d is: %.0f degrees Celsius\n\n", (resultRow + 1), highest[resultRow]);
        }

        userInput.close();
    }
}
