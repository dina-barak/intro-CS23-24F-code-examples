package w1expressions;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float a = input.nextFloat();
        System.out.print("Enter another number: ");
        float b = input.nextFloat();
        System.out.println("Here you go: " + (a + b));
    }
}
