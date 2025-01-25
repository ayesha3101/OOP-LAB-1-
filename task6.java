package myfirstpackage;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=scanner.nextInt();
        System.out.println("enter the value of b");
        int b=scanner.nextInt();
        scanner.close();
        System.out.println("the value of a before swapping "+a);
        System.out.println("the value of b before swapping "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a after swapping "+a);
        System.out.println("the value of b after swapping "+b);





    }

}