package w2flowcontrol;

public class ForDouble2 {
    public static void main(String[] args) {
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        */
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        stop:
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ":");
            for (int j = 1; j <= 10; j++) {
                if (i <= j) break;
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
        System.out.println("after for");

    }
}
