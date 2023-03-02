/**
 * description: This demo shows how to use a nested loop by creating a
 * multiplication table.
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++){
            //(1)
            for(int j = 1; j <=9; j++){
                //(2)

                System.out.printf("%4d",(i * j));
                //(3)
            }
            //(4)
            System.out.println();
        }
        //(5)
    }
}

/**
 * 1  2  3  4  5
 * 2  4  6  8  10
 * 3  6  9  12 15
 * 4  8  12 16 20
 */