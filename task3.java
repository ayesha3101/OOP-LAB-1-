import java.util.Scanner;
public class task3 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("enter number 3");
        int num3 = scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(+num1+" is the largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(+num2+" is the largest");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(+num3+" is the largest");
        }
        scanner.close();
    }

}