public class P_find_no_of_7 {

    static class sum{
        int data = 5;

    }
    public static void find7(int matrix[][], int key) {
        int count = 0;
        // int rowLen = matrix.length;
        // int colLen = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key)
                    count+=1;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int key = 8;
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // find7(matrix, key);

        sum obj1 = new sum();
        System.out.println(obj1.data);

    }

}
