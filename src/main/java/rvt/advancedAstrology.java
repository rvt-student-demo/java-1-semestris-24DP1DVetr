package rvt;

public class advancedAstrology {
    public static void main(String[] args) {
        christmasTree(4);

    }
    public static void printSpaces(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }
    public static void printStars(int number) {
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
    }
    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++){
            printSpaces(height-i);
            printStars(i*2-1);
            System.out.println();
        }
        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }
}
