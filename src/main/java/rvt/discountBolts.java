package rvt;
import java.util.Scanner;

public class discountBolts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Skrūvju skaits: ");
        int screw = Integer.valueOf(input.nextLine());
        final int screwPrice = 5;

        System.out.print("Uzgriežņu skaits: ");
        int nut = Integer.valueOf(input.nextLine());
        final int nutPrice = 3;

        System.out.print("Paplāksņu skaits: ");
        int washer = Integer.valueOf(input.nextLine());
        final int washerPrice = 1;

        boolean hasNutIssue = false;
        boolean hasWasherIssue = false;
        System.out.println();
        if(screw>nut){
            System.out.println("Parbaudi pasūtījumu: par maz uzgriežņu");
            hasNutIssue = true;
        } 
        if(screw*2>washer){
            System.out.println("Parbaudi pasūtījumu: par maz paplāksņu");
            hasWasherIssue = true;
        } 
        if(!hasNutIssue && !hasWasherIssue){
            System.out.println("Pasūtījums ir kārtībā.");
        }

        System.out.println();
        int finalPrice = screw*screwPrice + washer*washerPrice + nut*nutPrice;
        System.out.println("Kopējā cena: " + finalPrice);
    }
}
