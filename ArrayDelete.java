package DAY1;
public class ArrayDelete {
		
	
    public static int[] deleteElement(int[] array, int index) {
        
        int[] newArray = new int[array.length - 1];
        
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        
        array = deleteElement(array, 2);
        
       
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}


