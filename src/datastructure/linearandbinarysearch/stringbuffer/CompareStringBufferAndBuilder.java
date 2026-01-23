package datastructure.linearandbinarysearch.stringbuffer;

public class CompareStringBufferAndBuilder {

    public static void main(String[] args) {

        int n = 1_000_000;

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }
        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder));
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer));
    }
}
