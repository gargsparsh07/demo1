package datastructure.linearandbinarysearch.stringbuffer;

public class ConcatenateStringsUsingStringBuffer {

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "awesome"};

        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }

        System.out.println("Concatenated String: " + sb);
    }
}
