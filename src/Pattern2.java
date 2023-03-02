/**
 *                   1
 *               1   2
 *            1  2   4
 *         1  2  4   8
 *       1 2  4  8   16
 *     1 2 4  8  16  32
 *   1 2 4 8  16 32  64
 * 1 2 4 8 16 32 64 128
 */
public class Pattern2 {

    public static void main(String[] args) {
        String space = " ";
        //int number = 0;
        for(int row = 0; row <= 7; row++){
            for(int column = 1; column <= 7 - row; column++){
                System.out.printf("%4s",space);
            }

            for(int column = 0; column <= row; column++){
                int number  = (int)(Math.pow(2,column));
                System.out.printf("%4d", number);
            }
            System.out.print('\n');
        }

    }
}
