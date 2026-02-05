package javacollectionsstreams.regexandjunit.regex;

import java.util.regex.*;

public class RegexExtractCurrency {

    public static void main(String[] args) {
        String text = "Price $45.99 and discount 10.50";
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
