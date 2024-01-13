import java.util.Arrays;

public class P_String_anagram {
    public static void anagram(String str1, String str2) {
        char ArString1[] = str1.toCharArray();
        char ArString2[] = str2.toCharArray();

        Arrays.sort(ArString1);
        Arrays.sort(ArString2);

        boolean result = Arrays.equals(ArString1, ArString2);
        if (result == true) {
            System.out.println("given string is anagram");
        } else {
            System.out.println("this string is not anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        anagram(str1, str2);
    }

}
