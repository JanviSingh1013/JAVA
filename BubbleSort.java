import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
;
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	static int[] bubbleSort(int[] arr){
		int pass = 0;
		boolean swapped;
		for(int i = 0;i<arr.length ;i++){
			swapped = false;
			for(int j = 1 ;j <= arr.length - i - 1;j++){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}

				System.out.println(Arrays.toString(arr));
			}
			if(!swapped){
				break;
			}
			System.out.println("Pass = " + pass++);
		}
		return arr;
	}

}
