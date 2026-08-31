package LinearAndBinarySearch;

public class StringBufferBuilder {
    public static void main(String[] args) {

        int n = 1000000;

        long start = System.nanoTime();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        long bufferTime = end - start;

        start = System.nanoTime();

        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append("hello");
        }

        end = System.nanoTime();
        long builderTime = end - start;

        System.out.println("StringBuffer Time: " + bufferTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");
    }
}