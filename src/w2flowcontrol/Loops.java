package w2flowcontrol;

public class Loops {
    public static void main(String[] args) {
        int i1 = 0, i2 = 0;
        int n = 5;
        // do-while loop
        System.out.println("DO-WHILE\n-----------------");
        do {
            System.out.println("i1 = " + i1 + ", i1++ :" + i1++);
        } while (i1 < n);
        // while loop
        System.out.println("WHILE\n-----------------");
        while (i2 < n){
            System.out.println("i2 = " + i2 + ", ++i2 :" + ++i2);
        }
        // for loop
        System.out.println("FOR loop\n-----------------");
        for (int i3 = 0; i3 < n; i3++) {
            System.out.println("i3 = " + i3);

        }
        /*for (double d = 0.1;  d < 5 ; d *= 2) {
            System.out.println(d);

        }*/
        /*for (byte s = 0; s < 128; s++){
            System.out.println(s);
        }*/

    }
}
