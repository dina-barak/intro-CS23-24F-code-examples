package w1expressions;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number:");
        try {
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

