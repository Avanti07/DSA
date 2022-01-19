import java.util.*;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int[] arr = {5,1,4,3,7,2};
        
        for(int i =0; i<arr.length; i++){
            boolean swapped = false;
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                
            if( swapped == false){
                break;
            }
        }
        }
        
        System.out.println("After Sorting" + Arrays.toString(arr));
    }
}
