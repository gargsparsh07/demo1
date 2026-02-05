package javacollectionsstreams.regexandjunit.regex;

public class RegexReplaceSpaces {

    public static void main(String[] args) {
        String text = "This   is   an   example";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
