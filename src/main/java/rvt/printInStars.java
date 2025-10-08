package rvt;

public class printInStars {
        public static void main(String[] args) {
            int[] arrayList = {5, 1, 3, 4, 2};
            
            for(int index = 0; index < arrayList.length; index++){
                for(int times = 0; times < arrayList[index]; times++){
                System.out.print("*");
             }
                System.out.println();
        }
    }
}
