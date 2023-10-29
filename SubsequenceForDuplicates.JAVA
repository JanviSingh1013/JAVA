public class SubsequenceForDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,4};
        List<List<Integer>> ans = subsetforduplicate(arr);
        for (List<Integer> res : ans){
            System.out.println(res);
        }
    }
    static List<List<Integer>> subsetforduplicate(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
