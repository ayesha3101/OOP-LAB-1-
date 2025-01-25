package myfirstpackage;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        int tempC=scanner.nextInt();
        int tempF= tempC*(9/5)+32;
        System.out.println("the temperature in farenheit is "+tempF);
        scanner.close();

    }

}