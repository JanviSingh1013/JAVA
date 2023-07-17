class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for( int i = 0; i < arr1.length; i ++){
            boolean flag = true;
            int s = 0, l = arr2.length-1;
            while(s <= l){
                int mid = (s + l) / 2;
               if(arr1[i] <= arr2[mid]){
                    if(Math.abs(arr1[i] - arr2[mid]) > d){
                    l = mid - 1;
                }
                else{
                    flag = false;
                    break;
                }
               }
               else{
                    if(Math.abs(arr1[i] - arr2[mid]) > d){
                    s = mid + 1;
                }
                else{
                    flag = false;
                    break;
                }
               }
            }
            if(flag == true){
                ans = ans + 1;
            }
        }
        return ans;
    }
}
