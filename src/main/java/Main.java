import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    static int countLast(final String a) {
        int len = 0;
        String x = a.trim();
        for( int i = 0;
        i < x.length();
        i++){
            if (x.charAt(i) == ' ')
                len = 0;
            else len++;
        }
        return len;
    }
    static int countWords(String input) {
        if (input == null)
            return 0;
        String[] words = input.split("\\s+");
        return words.length;
    }
    static int countThe(String str, String word){
        String a[] = str.split(" ");
        int count = 0;
        for (int i=0; i < a.length; i++){
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var word = "the";
        String inputStr = scanner.nextLine().toLowerCase();
        System.out.println("Total THE count is: " + countThe(inputStr, word));
        System.out.println("Total WORD count is: " + countWords(inputStr));
        System.out.println("Total LETTER COUNT OF LAST WORD is: " + countLast(inputStr));

        }

    }







