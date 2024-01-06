package practice.sentencies;

public class Sentence {

    // count words in Sentence
    public int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals("-")
                    || words[i].equals(",") || words[i].equals("!")
                    || words[i].equals("?") || words[i].equals(".")
                    || words[i].equals(":") || words[i].equals(";")
                    || words[i].equals("(") || words[i].equals(")")
                    || words[i].equals("^") || words[i].equals("+")
                    || words[i].equals("*") || words[i].equals("/")
                    || words[i].equals("<") || words[i].equals(">")
                    || words[i].equals("{") || words[i].equals("}")
                    || words[i].equals("[") || words[i].equals("]")
                    || words[i].equals("@") || words[i].equals("'")
                    || words[i].equals("#") || words[i].equals("$")
                    || words[i].equals("&") || words[i].equals("№")) {
                n++;
            }
        }
 //       System.out.println(words.length);
 //       System.out.println(n);
        return words.length - n;
    }

    // count symbols in Sentence
    public int countSymbols(String str) {
        String[] letters = str.split("");
        int n = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals("–") || letters[i].equals("-")
                    || letters[i].equals(",") || letters[i].equals("!")
                    || letters[i].equals("?") || letters[i].equals(".")
                    || letters[i].equals(":") || letters[i].equals(";")
                    || letters[i].equals("(") || letters[i].equals(")")
                    || letters[i].equals("^") || letters[i].equals("+")
                    || letters[i].equals("*") || letters[i].equals("/")
                    || letters[i].equals("<") || letters[i].equals(">")
                    || letters[i].equals("{") || letters[i].equals("}")
                    || letters[i].equals("[") || letters[i].equals("]")
                    || letters[i].equals("@") || letters[i].equals("'")
                    || letters[i].equals("#") || letters[i].equals("$")
                    || letters[i].equals("&") || letters[i].equals(" ")
                    || letters[i].equals("№") || letters[i].equals("_"))
                n++;
            }
        return letters.length - n;
    }
}
