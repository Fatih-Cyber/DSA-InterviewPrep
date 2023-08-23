package Cydeo;

public class RotateImage90Degrees {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] m={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int pixValue=1;
        for (int i=0;i<3;i++)
            for (int y=0;y<3;y++)
                matrix[i][y]=pixValue++;

        rotate90(matrix);
        System.out.println();
        printMatrix(matrix);
    }
    // This class has two methods one of which rotates a nxn matrix 90 degrees in-place.
    // Second method just prints the matrix on the console.
    public static  void rotate90(int[][] matrix) {

        int n = matrix.length;
        printMatrix(matrix);

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int temp = matrix[first][i]; // save temp
                // Four edges, four operations
                matrix[first][i] = matrix[last-offset][first];// bottom Left->left Top
                matrix[last-offset][first] = matrix[last][last - offset]; //bottom right-> bottom left
                matrix[last][last - offset] = matrix[i][last];//right top -> bottom right
                matrix[i][last] = temp; // right top <- saved temp
                printMatrix(matrix);
            }
        }

    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                    System.out.print(" ");
                }
                if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                    System.out.print(" ");
                }
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
