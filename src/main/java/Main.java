import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    static final int MAX_CHAR = 256;
        static void getOccurringChar(String inputString) {

            int count[] = new int[MAX_CHAR];
            int len = inputString.length();

            for (int i = 0; i < len; i++)
                count[inputString.charAt(i)]++;

            char ch[] = new char[inputString.length()];
            for (int i= 0; i < len; i++) {
                ch[i] = inputString.charAt(i);
                int find = 0;
                for (int j = 0; j <= i; j++) {
                    if (inputString.charAt(i) == ch[j])
                        find++;
                    }

                if (find == 1)
                    System.out.println("Number of Occurrence of " + inputString.charAt(i) + " is: " + count[inputString.charAt(i)]);
                }
            }


    public static void main(String[] args) {
        System.out.println("Enter sentence: ");
        Scanner scanner = new Scanner(System.in);
        var inputString = scanner.nextLine().toLowerCase();
        StringBuilder str = new StringBuilder(inputString);
        StringBuilder revStr = str.reverse();

 //     System.out.println("Reverse String: " + revStr.toString());
        getOccurringChar(inputString);

    }
}







