package w2flowcontrol;

public class For1 {
    public static void main(String[] args) {
        for (int i = 0, j=0; i < 10 || j<20; i++, j++) {
            System.out.println("i = " + i + " j = " + j);

        }
    }
}
