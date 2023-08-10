class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0, l = arr.length - 1;
        while(s <= l){
            int mid = (s + l) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k ){
                s = mid + 1;
            }
            else{
                l = mid - 1;
            }
        }
        return s + k;
    }
}
