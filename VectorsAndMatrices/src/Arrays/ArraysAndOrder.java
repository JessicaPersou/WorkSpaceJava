package Arrays;

import java.util.Arrays;

public class ArraysAndOrder {

    public static void main(String[] args) {
        int[] numbers = {9,0,3,4,7,1,8};
        //para colocar o array em orderm crescente
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}

