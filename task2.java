import java.util.Scanner;
public class task2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int no= scanner.nextInt();
        if(no%2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        scanner.close();
    }

}