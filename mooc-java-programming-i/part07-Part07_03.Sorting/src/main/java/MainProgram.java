
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
//         write your test code here
        int[] numbers = {2,6,1,0,3,5,4};
        
        
        MainProgram.sort(numbers);

        
        //MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        
        int smallestIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if(array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return array[smallestIndex];
    }
    
    public static int indexOfSmallest(int[] array){
        
        int smallest = smallest(array);
        int smallestIndex = -1;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == smallest) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
        
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int smallestNumberIndex = startIndex;
        int smallestNumber = table[startIndex];
        
        for (int i = startIndex; i < table.length; i++) {
            
            if(smallestNumber > table[i]) {
                smallestNumberIndex = i;
                smallestNumber = table[i];
            }
        }
        
        return smallestNumberIndex;
        
    }

    public static void swap(int[] array, int index1, int index2) {
        
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
        
    }
    
    public static void sortManual(int[] array) {
        
            System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min =i;
            
            for (int j = i + 1; j < array.length; j++) {
                
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(array, min, i);
            }
         
            System.out.println(Arrays.toString(array));   
        }
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length -1 ; i++) {
           
            int smallestIndex = indexOfSmallestFrom(array, i);
            
            if(smallestIndex != i ) {
                swap(array, i, smallestIndex);
            }
            System.out.println(Arrays.toString(array));
        }
    }
    
}
