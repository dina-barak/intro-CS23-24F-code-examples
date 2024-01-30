package w2flowcontrol.notused;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert number:");
        double number = scan.nextDouble();
        if (number > 0){
            System.out.println("Your number is greater then 0.");
        } else  if (number < 0){
            System.out.println("Your number is less than 0.");
        } else System.out.println("You entered 0.");
    }
}
