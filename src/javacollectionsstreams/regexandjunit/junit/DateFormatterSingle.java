package javacollectionsstreams.regexandjunit.junit;

public class DateFormatterSingle {

    public String formatDate(String date) {
        String[] p = date.split("-");
        if (p.length != 3) throw new IllegalArgumentException();
        return p[2] + "-" + p[1] + "-" + p[0];
    }

    public static void main(String[] args) {
        DateFormatterSingle df = new DateFormatterSingle();

        System.out.println("Date Test: " +
                df.formatDate("2024-02-01").equals("01-02-2024"));
    }
}
