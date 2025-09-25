package rvt;
import java.util.Scanner;

public class numberSumOfNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfNum = 0;
        int sumNum = 0;

        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(input.nextLine());

            if (num==0){
                break;
            }
            numOfNum += 1;
            sumNum += num;
        }
    System.out.println("Number of numbers: " + numOfNum);
    System.out.println("Sum of numbers: " + sumNum);
    
    input.close();
    }
}