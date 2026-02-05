package javacollectionsstreams.regexandjunit.regex;

import java.util.regex.*;

public class RegexRepeatingWords {

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE)
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
