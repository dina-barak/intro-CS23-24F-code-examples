package w1expressions;

public class Casting {
    public static void main(String[] args) {
        int n1 = 33, n2 = 5;
        double d1 = 12.0;
        int int1 = n1 / n2;
        System.out.println("int1 = " + int1);
        double db1 = n1 / n2;
        System.out.println("db1 = " + db1);
        double db2 = d1 / n2;
        System.out.println("db2 = " + db2);
        double db3 = n1 / (double) n2;
        System.out.println("db3 = " + db3);
 /*       byte ib = 5;
        short is = ib;
        char c = (char) is;
        int is2 = c;
        */

    }
}
