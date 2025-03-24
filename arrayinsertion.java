package DAY2;

import java.util.Arrays;

public class arrayinsertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2; 
        int value = 10;  
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}

