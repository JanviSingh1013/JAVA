import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args){
		int[] arr = {4,5,1,2,3};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr){
		for(int i = 0;i < arr.length;i++){

			int last_index = arr.length - 1 - i;
			int max_index = findMax(arr, 0, last_index);
			swap(arr, last_index, max_index);


		}
	}

	public static int findMax(int[] arr, int start, int last){
		int max = start;
		for(int i = start; i < = last;i++){
			if(arr[i] > arr[max]){
				max = i;
			}
		}
		return max;
	}

	public static void swap(int[] arr, int last_index, int max_index){
		int temp = arr[last_index];
		arr[last_index] = arr[max_index];
		arr[max_index] = temp;
	}
}
