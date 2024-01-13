public class staircase_search {
    public static void staircase(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col]==key) {
                System.out.println("key found in ("+row+" "+col+")");
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("element not found");
    }

    public static void main(String[] args) {
        int key = 11;
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        staircase(matrix, key);

    }
}
