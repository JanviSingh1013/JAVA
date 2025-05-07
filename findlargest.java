import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {7, 8, 5, 9, 25, 1, 2, 3, 4, 6, 25, 1234567890, 1234567890, 1234567890};
//        int[] arr = {5, 5, 5, 5};
        int[] arr = {7, 7, 7, 7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7};
//        int[] arr = {Integer.MAX_VALUE, Integer.MAX_VALUE};


//        System.out.println("the largest is " + findingLargets(arr));
//        System.out.println("the 2nd largest is " + findThe2ndLargest(arr));
//        System.out.println("best the 2nd largest is " + findThe2ndLargestBetter(arr));
        System.out.println("optimal the 2nd largest is " + findThe2ndLargestOptimal(arr));
    }

    private static int findThe2ndLargestOptimal(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    private static int findThe2ndLargestBetter(int[] arr) {
        int secondLargest = -1;
        int largest = 0;

        if (arr.length < 2 || secondLargest == 0)
            throw new IllegalArgumentException("No second largest element");
        largest = findingLargets(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    private static int findThe2ndLargest(int[] arr) {
        int secondLargest = 0;

        if (arr.length < 2 || secondLargest == 0)
            throw new IllegalArgumentException("No second largest element");


        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    private static int findingLargets(int[] arr) {
        int largest = arr[0];
        System.out.println(largest);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
