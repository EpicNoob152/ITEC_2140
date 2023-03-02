/**
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */

public class Pattern1 {

    public static void main(String[] args) {

        for(int row = 0; row < 5; row++ ){
            //inner for loop to identify how many loops iterate for each
            // outer loop

            for(int column = 1; column <= 5 - row; column++ ){
                System.out.print(column + "  ");
            }
            System.out.print("\n");

        }
    }
}
