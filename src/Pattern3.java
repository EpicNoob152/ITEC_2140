/**
 * 1 2 3 4 5 6
 *   1 2 3 4 5
 *     1 2 3 4
 *       1 2 3
 *         1 2
 *           1
 */
public class Pattern3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            //about leading space
            for(int j = i; j > 1 ; j-- ){
                System.out.print("  ");
            }

            for(int j = 1; j <= 6 + 1 - i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();

            //write about numbers



        }
    }
}
