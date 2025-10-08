package rvt;

public class sumOfArray {
    public static void main(String[] args){
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }

    public static int sumOfNumbersInArray(int[] arrayList){
        int sum = 0;
        for(int index = 0; index < arrayList.length; index++){
            sum += arrayList[index];
        }
        System.out.println(sum);
        return sum;
    }
}
