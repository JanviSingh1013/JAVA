import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        // counting sort is a non-comparison based sorting algorithm that works by counting
        // the number of occurrences
        // of each unique element in the input array.
        // It is efficient for sorting integers or objects that can be mapped to integers.
        // here we make the frequency array  of length max_element + 1,
        // then in that array we store the frequency of each element of the original array.
        
        
        
        
        /*
        		Integer Keys: 
        		The input keys must be integers. 
        		Because the algorithm relies on array indexing, 
        		it cannot natively process floating-point numbers 
        		or complex strings without mapping them to integers first.
        		
        		Bounded Range (k): 
        		The elements must fall within a known range from 0 to k.
        		
        		Small Range Scale: 
        		It assumes that the range of potential values 
        		(k) is not significantly larger than 
        		the total number of elements (n). Ideally, the maximum value should be linearly proportional
        		to the size of the array (k = O(n)).
        		
        		
        		Non-Negative Values: 
        		Standard textbook implementations assume the
        		integers are non-negative (≥ 0) so they can directly align with array indices starting at zero. 
        		Handling negative numbers requires an additional pre-processing step to offset the values.
        
        
        */

        int[] input = new int[]{8,2,6,2,4,2,9,8,9,1,9,7};
        int max = findMaxElement(input);
        System.out.println("Max elemt "+ max);
        
        int[] freqArr = createFreqArray(max, input);
        
        System.out.println("freqArr elemt "+ Arrays.toString(freqArr));
        
        sort(freqArr, input);
        System.out.println("sorted array "+ Arrays.toString(input));


    }
    
    public static void sort(int[] freqArr, int[] input){
    	int currentIndex = 0;
    	for(int i = 0;i<freqArr.length;i++){
    		int freq = freqArr[i]; // 0 = 0
    		
    		while(freq > 0){
    			input[currentIndex] = i;
    			currentIndex++;
    			freq--;
    		}
    		
    	} 
    }
    
    public static int[]  createFreqArray(int max,int[] input){
    	int[] freqArr = new int[max + 1];
        // _ _ _ _ _ _ _ _ _ _
        //0 1 2 3 4 5 6 7 8 9
        
        for(int i = 0; i<input.length; i++){
        	freqArr[input[i]] = freqArr[input[i]] + 1;
        }
        
        
        return freqArr;
        
    }

    public static int findMaxElement(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
        	if(arr[i]>max){
        		max = arr[i];
        	}
        }
        return  max;
    }
}
