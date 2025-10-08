package rvt;
import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        int[] arrayList = {1, 3, 5, 7, 9};

        Scanner reader = new Scanner(System.in);
        for(int index = 0; index < arrayList.length; index++){
            System.out.println(arrayList[index]);
        }

        System.out.println("Give two indices to swap: ");
        int firstIndexToSwap = Integer.valueOf(reader.nextLine());
        int secondIndexToSwap = Integer.valueOf(reader.nextLine());
        
        int tempNumber = arrayList[firstIndexToSwap];
        arrayList[firstIndexToSwap] = arrayList[secondIndexToSwap];
        arrayList[secondIndexToSwap] = tempNumber;

        System.out.println();
        for(int index = 0; index < arrayList.length; index++){
            System.out.println(arrayList[index]);
        }
        reader.close();
    }


}
