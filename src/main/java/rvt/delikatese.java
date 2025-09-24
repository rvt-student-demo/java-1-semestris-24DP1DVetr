package rvt;
import java.util.Scanner;

public class delikatese {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double deliveryPrice = 0.0;

        System.out.print("Ievadi preci: ");
        String itemName = input.nextLine();

        System.out.print("Ievadi cenu: ");
        double itemPrice = Double.valueOf(input.nextLine());

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int expressDelivery = Integer.valueOf(input.nextLine());

        if(itemPrice<10){
            deliveryPrice = 2.0;
        }
        if(expressDelivery==1){
            deliveryPrice += 3.0;
        }


        System.out.println();
        System.out.println("Rēķins: ");
        System.out.println(itemName + " " + itemPrice);
        System.out.println("piegāde " + deliveryPrice);
        System.out.println("kopā " + (itemPrice+deliveryPrice));

    }
}
