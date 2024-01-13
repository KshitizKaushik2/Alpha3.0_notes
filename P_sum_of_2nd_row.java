public class P_sum_of_2nd_row {
    public static void sum_of_2nd_row(int matrix[][]) {
        int sum = 0;
        for (int col = 0; col < matrix.length; col++) {
            sum += matrix[1][col];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 8, 8, 7 } };

        sum_of_2nd_row(matrix);
    }
}
