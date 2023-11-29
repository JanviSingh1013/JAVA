class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                res = res + 1;
            }
        }
        return res;
    }
}
