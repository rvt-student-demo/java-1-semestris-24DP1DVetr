package rvt;

public class divisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int counter = beginning; counter <=end; counter++){
            if (counter % 3 == 0){
                System.out.println(counter);
            }
        }
    }
}
