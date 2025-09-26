package rvt;
import java.util.Scanner;

public class repeatingBreakingAndRemembering {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sumNum = 0;
        int amountNum = 0;
        int even = 0;
        int odd = 0;

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sumNum);
                System.out.println("Numbers: " + amountNum);
                System.out.println("Average: " + ((double)sumNum/amountNum));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            sumNum += number;
            amountNum++;
            if(number%2 == 0){
                even++;
            } else{
                odd++;
            }
        }
        scanner.close();
    }
}
