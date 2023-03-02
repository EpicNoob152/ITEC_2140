/**
 * Write a program (HasNextDemo.java) that
 * Uses a Scanner to ask the user to enter temperatures as doubles.
 * Select any letter when you are done entering temperatures.
 * Use hasNextDouble to control the while loop
 * Determine and SOP the average temperature.
 */
import java.util.Scanner;
public class HasNextDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature value: ");
        int count = 0;
        double sum = 0.0;
        double average = 0;


//        while(input.hasNextDouble()){
        do{
            double temperature = input.nextDouble();
            sum += temperature;
            count++;
            //how many temperature values you input

            average = sum / count;
        }while(input.hasNextDouble());
        System.out.println("Average temperature is " + average);
        //you will need to provide average.
        //you can print out sum



    }
}
