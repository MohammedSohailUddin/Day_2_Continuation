package Exercise8;

public class Generics {

    public static <T> void swap(T[] array, int left, int right){
        T temp = array[right];
        array[right] = array[left];
        array[left] = temp;
        System.out.println("Swapped Elements are: "+array[left]+" "+array[right]);
    }


    public static void main(String[] args){

        Integer[] nums = {10, 20, 30, 40};
        swap(nums, 0, 1);
        swap(nums, 2, 3);
    }
}


//Output:
//	Swapped Elements are: 20 10
//	Swapped Elements are: 40 30
