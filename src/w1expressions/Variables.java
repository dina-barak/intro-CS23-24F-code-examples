package w1expressions;

public class Variables {
    static int classVar;
    public static void main(String[] args) {
        float x = (float)(40 % 15.5);
        System.out.println(x);
        boolean a = true;
        double y = 5.123456789012345678901234567890;
        System.out.println(y);
        System.out.println(y*10);
        long l = 1234567890123456789L;
        int i = 10;
        int j = i = 20;
        System.out.println("i, j =" + i + ", " + j);
        char c = 'V';
        int ic = 88888;
        System.out.println("ic = " + ic + ", c = " + c);
        System.out.println("(char)ic = " + (char)ic + ", (int)c = " + (int)c);
        int b = -58;
        System.out.println("b >> 2 = " + (b >> 2));
        System.out.println("b >>>> 2 = " + (b >>> 2));
        j = j++ + 5;
        System.out.println("j = " + j);
        for (int k = 0; k < 10000; k+=100) {
            System.out.print((char) k + " ");
        }
        Integer io = 5;
        System.out.println("\n" + io);
        System.out.println("class variable = " + classVar);
        //check definition with var
        var v = 5.5;
        v = (int) v;
        System.out.println("printing v :" + v);

    }
}
