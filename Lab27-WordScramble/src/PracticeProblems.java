public class PracticeProblems {

    public static void main(String[] args) {
        // Problem 1
        System.out.println("'7' is the character 'a'? >>> " + isLetterA('7'));
        System.out.println("'a' is the character 'a'? >>> " + isLetterA('a'));
        System.out.println("'F' is the character 'a'? >>> " + isLetterA('F'));

        // Problem 2
        System.out.println("\"apple\" has at least 2 'a's? >>> " + hasMultipleAs("apple"));
        System.out.println("\"Some teachers eat apples.\" has at least 2 'a's? >>> " + hasMultipleAs("Some teachers eat apples."));

        // Problem 3
        System.out.println("'u' is a vowel? >>> " + isVowel('u'));
        System.out.println("'b' is a vowel? >>> " + isVowel('b'));
        System.out.println("'I' is a vowel? >>> " + isVowel('I'));

        // Problem 4
        System.out.println("Vowel count in \"salsa\" >>> " + numVowels("salsa"));
        System.out.println("Vowel count in \"The best teachers eat salsa.\" >>> " + numVowels("The best teachers eat salsa."));

        // Problem 5
        System.out.println("The word \"salsa\" has the same number of 'a' and 's'? >>> " + evenChars("salsa", 'a', 's'));
        System.out.println("The word \"salsa\" has the same number of 'a' and 'f'? >>> " + evenChars("salsa", 'a', 'f'));

        // Problem 6
        System.out.println("The word \"programmer\" has a repeated 'm'? >>> " + hasRepeat("programmer", 'm'));
        System.out.println("The word \"programmer\" has a repeated 'r'? >>> " + hasRepeat("programmer", 'r'));

        // Problem 7
        System.out.println("Capitalizing 'm' gives you >>> " + capChar('m'));
        System.out.println("Capitalizing 'W' gives you >>> " + capChar('W'));

        // Problem 8
        System.out.println("Capitalizing vowels in \"salsa\" gives you >>> " + capVowels("salsa"));
        System.out.println("Capitalizing vowels in \"SCRUMPTIOUS\" gives you >>> " + capVowels("SCRUMPTIOUS"));
    }

    public static boolean isLetterA(char letter) {
        return "Aa".indexOf(letter) != -1;
    }


    public static boolean hasMultipleAs(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isLetterA(s.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }

    public static boolean isVowel(char letter) {
        return "AEIOUaeiou".indexOf(letter) != -1;
    }

    public static int numVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    public static boolean evenChars(String s, char a, char b) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                countA++;
            } else if (s.charAt(i) == b) {
                countB++;
            }
        }
        return countA == countB;
    }

    public static boolean hasRepeat(String s, char a) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == a && s.charAt(i+1) == a) {
                return true;
            }
        }
        return false;
    }


    public static String capChar(char a) {
        return (a + "").toUpperCase();
    }

    public static String lowChar(char a){
        return (a + "").toLowerCase();
    }



    public static String capVowels(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isVowel(current)) {
                result += capChar(current);
            } else {
                result += lowChar(current);

            }
        }
        return result;
    }


}
