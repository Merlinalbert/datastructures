package DAY2;

import java.util.Arrays;

public class arraydeletion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2; 
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i]; 
        }
        System.out.println("Array after deletion: " + Arrays.toString(newArr));
    }
}

