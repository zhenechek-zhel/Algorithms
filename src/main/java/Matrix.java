public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        int maxInd = matrix.length - 1;

        int k = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t" );
            }
            System.out.println();
        }

        System.out.println("-----------------");


        for (int i = maxInd; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("---------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = maxInd; i >= 0; i--) {
            for (int j = maxInd - i - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



    }
}

