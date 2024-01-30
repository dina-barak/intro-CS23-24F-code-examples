package w2flowcontrol;

public class NestedLoop {
    public static void main(String[] args) {
        int rows = 5;

        // outer loop
        for (int i = 0; i < rows; i++) {

            // inner loop to print the numbers
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
