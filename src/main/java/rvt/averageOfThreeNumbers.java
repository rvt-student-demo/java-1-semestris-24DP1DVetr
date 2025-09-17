package rvt;
import java.util.Scanner;

public class averageOfThreeNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double firstNumber = Double.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        double secondNumber = Double.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        double thirdNumber = Double.valueOf(scanner.nextLine());

        double average = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.println("The average is " + average);
    }
}