import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = scanner.nextInt();
        System.out.println("enter number 2");
        int b = scanner.nextInt();
        System.out.println("the sum the of two numbers is " + (a + b));
        System.out.println("the average of the two numbers is " + (a + b) / 2);
        System.out.println("the product of the two numbers is " + (a * b));
    }
