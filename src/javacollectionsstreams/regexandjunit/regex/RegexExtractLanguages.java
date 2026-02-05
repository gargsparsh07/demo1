package javacollectionsstreams.regexandjunit.regex;

import java.util.regex.*;

public class RegexExtractLanguages {

    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript, and Go.";
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
