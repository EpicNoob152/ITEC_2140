/**
 * this program is demonstration of using do-while loop.
 * The purpose of this program is to generate the min value and a max value.
 */
import java.util.Scanner;
public class MinMaxDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value. To stop, type any value " +
                "besides an integer");

        int max = 0, min = 0;

        do{
            int value = input.nextInt();
            if(value > max){
                max = value;
            }

            if(value < min){
                min = value;
            }

        }while(input.hasNextInt());

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);


    }
}
