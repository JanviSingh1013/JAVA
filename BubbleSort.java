import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {42, 17, 98, 23, 55, 72, 31, 88, 10, 5, 67, 19, 81, 29, 93, 2, 49, 12, 77, 34, 53, 68, 9};
;
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	static int[] bubbleSort(int[] arr){
		int pass = 0;
		for(int i = 0;i<arr.length ;i++){
			for(int j = 1 ;j <= arr.length - i - 1;j++){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("Pass = " + pass++);
		}
		return arr;
	}

	// static void swap(int a, int b){
	// 	int temp = a;
	// 	a = b;
	// 	b = temp;
	// }
}
