
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        
        for(int i = 1; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        
        for(int i = startIndex; i < table.length; i++){
            if(smallest > table[i]){
                smallest = table[i];
                startIndex = i;
            }
        }
        
        return startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        
        array[index2] = array[index1];
        
        array[index1] = temp;
    }
    
    public static void sort(int[] array) {
        int small = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            small = smallest(array);
            index = indexOfSmallestFrom(array, i);
            swap(array, index, i);
        }
    }
}
