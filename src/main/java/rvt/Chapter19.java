package rvt;
import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args){
        ex7();
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int begin = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println();
        while(begin<=end){
            System.out.println(begin);
            begin++;
        }
        scanner.close();
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        int loopSum = 0;

        while(counter <= n){
            loopSum += counter;
            counter++;
        }

        int formulaSum = (n*(n+1))/2;
        
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
        scanner.close();
    }
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        int loopSum = 0;

        while(counter <= n){
            loopSum += counter * counter;
            counter++;
        }

        int sumOfSquares = (n*(n+1)*(2*n+1))/6;
        
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + sumOfSquares);
        scanner.close();
    }
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low:");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high:");
        int high = Integer.valueOf(scanner.nextLine());

        int sumHigh = (high*(high+1))/2;
        int sumLow = (low*(low-1))/2;
        System.out.println("Sum = " + (sumHigh - sumLow));
        scanner.close();
    }
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String inputString = scanner.nextLine();

        int times = inputString.length();
        int count = 0;
        System.out.println();
        while(count < times){
            System.out.println(inputString);
            count++;
        }
        scanner.close();
    }
    public static void ex6(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstInputString = scanner.nextLine();
        System.out.println("Enter second word:");
        String secondInputString = scanner.nextLine();

        int sumLength = firstInputString.length() + secondInputString.length();
        System.out.print(firstInputString);
        while(sumLength<30){
            System.out.print(".");
            sumLength++;
        }
        System.out.print(secondInputString);
        scanner.close();
    }
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word:");
        String inputString = scanner.nextLine();
        int stringLength = inputString.length();
        int index = 0;

        while(index < stringLength){
            System.out.println(inputString.charAt(index));
            index++;
        }
        scanner.close();
    }
}   
