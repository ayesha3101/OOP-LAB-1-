package myfirstpackage;
import java.util.Scanner;
public class task5 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
            fact=fact*i;

        }
        System.out.println("the factorial of "+num+" is "+fact);
        scanner.close();

    }

}