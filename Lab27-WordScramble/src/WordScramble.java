import java.util.*;

public class WordScramble {

    public static void scramble(String line) {
        String[] words = line.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 2) {

                String middle;
                //System.out.println(word.charAt(word.length()-1));

                if (!Character.isLetter(word.charAt(word.length()-1)))
                {
                    middle = word.substring(1, word.length() - 2);
                }
                else
                {
                    middle = word.substring(1, word.length() - 1);
                }

                char[] middleChars = middle.toCharArray();
                int n = middleChars.length;
                for (int j = n - 1; j > 0; j--) {
                    int k = (int) (Math.random() * (j + 1));
                    char temp = middleChars[j];
                    middleChars[j] = middleChars[k];
                    middleChars[k] = temp;
                }
                String shuffledMiddle = new String(middleChars);

                if (!Character.isLetter(word.charAt(word.length()-1)))
                {
                    result += word.charAt(0) + shuffledMiddle + word.substring(word.length() - 2) + " ";
                }
                else
                {
                    result += word.charAt(0) + shuffledMiddle + word.substring(word.length() - 1) + " ";
                }
            } else {
                result += word + " ";
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word, sentence, or entire paragraph followed by enter.");
        String input = scanner.nextLine();
        System.out.println("\nHere is a scrambled version:");
        scramble(input);
    }
}