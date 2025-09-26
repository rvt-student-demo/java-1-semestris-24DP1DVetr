package rvt;
import java.util.Scanner;
import java.util.Random;

public class randomNumberGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(10)+1;
        System.out.println("Es domāju par skaitli no 1 līdz 10.\nTev tas jāuzmin trīs meģinājumos.\nIevadi minējumu:");

        for (int i = 0; i<=3; i++) {
            if (i==3){
                System.out.println("Parezais skaitlis bija " + randomNum);
                System.out.println("Tu esi zaudējis spēli.");
                break;
            }

            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput==randomNum){
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējis spēli.");
                break;
            } else {
                System.out.println("nepareizi!");
            }
        }
        scanner.close();
    }
}
