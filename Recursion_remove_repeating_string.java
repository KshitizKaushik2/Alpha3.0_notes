public class Recursion_remove_repeating_string {
    public static void removeRec(String str, boolean arr[], StringBuilder newstr, int index) {
        if (index == str.length()) {
            System.out.print(newstr);
            return;
        }
        char curChar = str.charAt(index);
        if (arr[curChar - 'a'] == true) {
            removeRec(str, arr, newstr, index + 1);
        } else {
            arr[curChar - 'a'] = true;
            removeRec(str, arr, newstr.append(curChar), index + 1);
        }
    }

    public static void main(String[] args) {

        String str = "aapnacollege";
        removeRec(str, new boolean [26], new StringBuilder(""), 0);
    }
}
