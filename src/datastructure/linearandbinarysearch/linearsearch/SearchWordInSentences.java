package datastructure.linearandbinarysearch.linearsearch;

public class SearchWordInSentences {

    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "I love programming",
                "Welcome to coding"
        };

        String target = "programming";
        String result = "Not Found";

        for (String sentence : sentences) {
            if (sentence.contains(target)) {
                result = sentence;
                break;
            }
        }

        System.out.println(result);
    }
}
