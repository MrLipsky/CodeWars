package dev.cw;

public class DuplicateEncoder {

    public static void main(String[] args) {

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
    }

//    Method converts a string to a new string
//    where each character in the new string
//    is "(" if that character appears only once
//    in the original string, or ")" if that character
//    appears more than once in the original string.
//    Method ignores capitalization when determining
//    if a character is a duplicate.

    static String encode(String word){
        char[] charArray = word.toLowerCase().toCharArray();
        StringBuilder newString = new StringBuilder();
        for (char c : charArray) {
            int counter = 0;
            for (char character : charArray) {
                if (c == character) {
                    counter++;
                    if (counter >= 2) {
                        break;
                    }
                }
            }
            newString.append((counter == 2) ? ')' : '(');
        }
        return newString.toString();
    }
}
