package rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Chapter44 {
    public static void main(String[] args) {
        ex4();
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

    // public static void ex3() {
    //     Scanner scanner = new Scanner(System.in);
    //     ArrayList<String> femaleList = new ArrayList<>(List.of("Amy", "Buffy", "Cathy"));
    //     ArrayList<String> maleList = new ArrayList<>(List.of("Elroy", "Fred", "Graham"));
    //     ArrayList<String> userList = new ArrayList<>();

    //     System.out.println("Enter a name:");
    //     while (true) {
    //         String input = scanner.nextLine();
    //         if (input.isEmpty()) {
    //             break;
    //         }
    //         userList.add(input);

    //         String title = "";

    //         for (String f : femaleList) {
    //             if (input.startsWith(f)) {
    //                 title = "Ms. ";
    //                 break;
    //             }
    //         }

    //         if (title.equals("")) {
    //             for (String m : maleList) {
    //                 if (input.startsWith(m)) {
    //                     title = "Mr. ";
    //                     break;
    //                 }
    //             }
    //         }
            
    //         System.out.println(title + input);
    //         System.out.println();
    //     }
    // }

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
        
    }
    public static void ex5(){
        
    }
}
