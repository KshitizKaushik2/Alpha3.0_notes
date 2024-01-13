import javax.sound.sampled.ReverbType;

public class function_prac {

    // question number 1
    public static void avg(int a, int b, int c) {
        float average = (a + b + c) / 3;
        System.out.println("average of numbers are: " + average);
    }

    // question number 2
    public static boolean isEven(int n) {
        if (n == 0) {
            return true;
        }

        if (n == 1) {
            return false;
        }

        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    //question number 3
    public static boolean isPalendrome(int num){
    int pal = num;
    int rev = 0;
    
    while (pal != 0){
        int remender = pal %10;
        rev = rev *10+ remender;
        pal = pal / 10;
    }
    if(num == rev){
        return true;
    }
    return false;
    }

    //question 5


    public static void main(String[] args) {

        // avg(5, 19, 45);

        System.out.println("is number even: " + isEven(55));
    }
}
