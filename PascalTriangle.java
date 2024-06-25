public class PascalTriangle{
    public static void main(String[] args) {
        int Rows = 10; // number of rows in the triangle
        print(Rows);
    }

    public static void print(int Rows) {
        int[][] triangle = new int[Rows][Rows];
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}