import java.util.Scanner;
import java.util.Arrays;
public class BubbleSortForString{
	public static void main(String[] args){
		char[] arr = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k'};

		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	static char[] bubbleSort(char[] arr){
		int pass = 0;
		boolean swapped;
		for(int i = 0;i<arr.length ;i++){
			swapped = false;
			for(int j = 1 ;j <= arr.length - i - 1;j++){
				if(arr[j] < arr[j-1]){
					char temp = arr[j];
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

	// static void swap(int a, int b){
	// 	int temp = a;
	// 	a = b;
	// 	b = temp;
	// }
}
