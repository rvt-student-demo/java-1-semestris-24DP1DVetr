package rvt;
import java.util.Scanner;

public class oddOrEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int number = Integer.valueOf(input.nextLine());

        if(number%2 == 0){
            System.out.println("Number " + number + " is even");
        } else{
            System.out.println("Number " + number + " is odd");
        }
    }
}