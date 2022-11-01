package CopyArrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 ){
                int[] number = Arrays.copyOf(numbers, 10);
                System.out.println(number[i]);
            }
        }
    }
}
