public class Main {
    public native float[] helloWorld();

    // Runs when the class is loaded (aka immediately after compilation)
    static {
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        System.out.println("Running!");
        float[] output = new Main().helloWorld();
        System.out.println("\nHi from Java! Here are the received array values:");
        for (int i = 0; i < 9; i++) {
            System.out.println(output[i]);
        }
    }

}