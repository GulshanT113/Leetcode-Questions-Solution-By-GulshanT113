class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // ArrayList<Integer> list = new ArrayList<>();
        // //for(int i : arr2) list.add(i);
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for(int i = 0; i < arr1.length; i++){
        //     if(arr1[i] == arr2[i])
        //         arr1[i] -= arr2[i];
        // }
        // for(int i = )
        // int[] arr = list.stream().mapToInt(i -> i).toArray();
        // return arr;
        int[] freq = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr1) freq[i]++;
        for(int i = 0; i < arr2.length; i++){
            while(freq[arr2[i]] != 0){
                list.add(arr2[i]);
                freq[arr2[i]]--;
            }
        }
        for(int i = 0; i < freq.length; i++){
            while(freq[i] != 0){
                list.add(i);
                freq[i]--;
            }
        }
        int idx = 0;
        int[] ans = new int[list.size()];
        for(int i: list) ans[idx++] = i;
        return ans;
    }
}