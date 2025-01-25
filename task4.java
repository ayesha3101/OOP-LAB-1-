package myfirstpackage;
import java.util.Scanner;
public class task4 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        int sum=0;
        while(num!=0){
          int mod=num%10;
          sum=sum+mod;
          num=num/10;
        }
        System.out.println("the sum of the digits is "+sum);
        scanner.close();
        
    }


}