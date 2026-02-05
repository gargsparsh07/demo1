package javacollectionsstreams.regexandjunit.regex;

import java.util.regex.*;

public class RegexCapitalizedWords {

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
