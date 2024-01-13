public class backtraking_suset_of_string {

    // printing
    public static void print(String str) {
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
        }
        System.out.println();
    }

    public static void subset(String str, String ans, int i) {

        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {// for empty string
                System.out.println("null");
            } else {
                print(ans);
            }
            return;
        }

        // recursion call and kam
        subset(str, ans + str.charAt(i), i + 1); // if chose is yes to join in ans

        // backtracking
        subset(str, ans, i + 1);// if choice is no
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subset(str, ans, 0);
    }
}
