package rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Chapter44 {
    public static void main(String[] args) {
        ex5();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine().trim();
        int spaceIndex = name.indexOf(" ");

        if (spaceIndex > 0) {
            String firstName = name.substring(0, spaceIndex);
            String lastName = name.substring(spaceIndex);

            System.out.println(firstName.concat(lastName.toUpperCase()));
        }
        scanner.close();
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String string = scanner.nextLine().trim();

        for (int index = 0; index < string.length(); index++) {
            System.out.println(string.charAt(index));
        }
        scanner.close();
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> femaleList = new ArrayList<>(List.of("Amy", "Buffy", "Cathy"));
        ArrayList<String> maleList = new ArrayList<>(List.of("Elroy", "Fred", "Graham"));

        while (true) {
            System.out.println("Enter a name:");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } 
            String title = "";
            for (int i = 0; i < femaleList.size(); i++){
                if (input.startsWith(femaleList.get(i))){
                    title = "Mrs. ";
                } else if(input.startsWith(maleList.get(i))){
                    title = "Mr. ";
                }
            }

            System.out.println(title + input);
            System.out.println();
        }
        scanner.close();
    }

    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        int time = Integer.valueOf(scanner.nextLine());

        if (String.valueOf(time).length() <= 2){
            System.out.printf("Your time-> 0:%d", time);
        } else if (String.valueOf(time).length() <= 4){
            System.out.printf("Your time-> %d:%d", time/100, time%100);
        } else {
            System.out.println("Error");
        }
        scanner.close();
    }

    public static void ex5(){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }
        }
        scanner.close();
    }

    public static void ex6(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            if (password.length() < 7){
                System.out.println("That password is not acceptable.\n");
                continue;
            }
            boolean noLower = password.equals(password.toUpperCase());
            boolean noUpper = password.equals(password.toLowerCase());
            if (noUpper || noLower) {
                System.out.println("That password is not acceptable.\n");
                continue;
            }
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++){
                if (Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit){
                System.out.println("That password is not acceptable.\n");
                continue;
            }
            System.out.println("Acceptable password.");
            break;
        }
        scanner.close();
    }
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String word = scanner.nextLine();
        String spaces = " ";
        System.out.println(word);

        while (word.length()>2){
            word = word.substring(1, word.length()-1);
            System.out.println(spaces + word);
            spaces += " ";
        }
        scanner.close();
    }
}
