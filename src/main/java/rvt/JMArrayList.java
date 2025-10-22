package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userArray = new ArrayList<>();
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput != -1) {
                userArray.add(userInput);
            } else {
                break;
            }
        }
        
        System.out.print("From where?");
        int startIndex = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?");
        int endIndex = Integer.valueOf(scanner.nextLine());

        for(int index = startIndex; index <= endIndex; index++){
            System.out.println(userArray.get(index));
        }
        scanner.close();
    }

    public static void listSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userArray = new ArrayList<>();
        while(true){
            String userInput = scanner.nextLine();
            if(!userInput.equals("")) {
                userArray.add(userInput);
            } else {
                break;
            }
        }
        System.out.println("In total: " + userArray.size());
        scanner.close();
    }

    public static void onTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userArray = new ArrayList<>();

        while(true){
            String userInput = scanner.nextLine();
            if(!userInput.equals("")) {
                userArray.add(userInput);
            } else {
                break;
            }
        }

        System.out.print("Search for? ");
        String searchFor = scanner.nextLine();
        boolean found = false;

        for(int index = 0; index < userArray.size(); index++){
            if(searchFor.equals(userArray.get(index))){
                System.out.printf("%s was found!", searchFor);
                found = true;
            }
        }
        if(!found){
            System.out.printf("%s was not found!", searchFor);
        }
        scanner.close();
    }

    public static void removeLast(ArrayList<String> strings){
        if(!strings.isEmpty()){
            strings.remove(strings.size()-1);
        }
        
    }
}
