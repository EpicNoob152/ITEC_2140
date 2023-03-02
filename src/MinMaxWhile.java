/**
 * Write a program (MinMaxWhile.java) that reads integers and prints
 * the smallest and largest of the inputs.
 * User will type in a letter to indicate there are no more integers.
 * Use a while loop and hasNextInt.
 *
 */
import java.util.Scanner;
public class MinMaxWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers as many as you want. To stop enter" +
                " any letter besides integer. ");

        int max = 0;
        int min = 0;

        while(input.hasNextInt()){
            int value = input.nextInt();
            if(value > max){
                max = value;
            }

            if(value < min){
                min = value;
            }

        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}
