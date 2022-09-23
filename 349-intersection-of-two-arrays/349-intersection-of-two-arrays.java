class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] freq = new int[1001];
        for(int i : nums1) freq[i] = 1;
        for(int i : nums2){
            if(freq[i] == 1){
                al.add(i);
                freq[i] = 0;
            }
        }
        int[] ans = new int[al.size()];
        int idx = 0;
        for(int i : al) ans[idx++]=i;
        return ans;
    }
}

// Set<Integer> s1 = new HashSet<>();
        // Set<Integer> s2 = new HashSet<>();
        // for(int i : nums1) s1.add(i);
        // for(int i : nums2) s2.add(i);
        // Set<Integer> res = new HashSet<>();
        // if(s1.size() >= s2.size()){
        //     for (Integer temp : s1) {
        //         if(s2.contains(temp)) res.add(temp);
        //     }
        // }
        // if(s2.size() > s1.size()){
        //     for (Integer temp : s2) {
        //         if(s1.contains(temp)) res.add(temp);
        //     }
        // }
        // int[] ans = new int[res.size()];
        // int idx = 0;
        // for (Integer temp : ans) ans[idx++] = temp;
        // return ans;