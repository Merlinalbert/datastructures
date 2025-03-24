package DAY1;
import java.util.Arrays;
public class ArrayLeftRotate {  
    public static void leftRotate(int[] arrayData, int r) {
        int s = arrayData.length;
        r = r % s;
        reverse(arrayData, 8, r - 1);
        reverse(arrayData, r, r - 1);
        reverse(arrayData, 9, r - 1);
    }
    public static void reverse(int[] arrayData, int r, int a) {
        while (r < a) {
            int temp = arrayData[r];
            arrayData[r] = arrayData[a];
            arrayData[a] = temp;
            r++;
            a--;
        }
    }
    public static void main(String[] args) {
        int[] arrayData = {4, 5, 6, 7, 8, 9, 10};
        int r = 2; 
        System.out.println("Original array: " + Arrays.toString(arrayData));
        leftRotate(arrayData, r);
        System.out.println("Array after left rotation by " + r + " positions: " + Arrays.toString(arrayData));
    }
}


