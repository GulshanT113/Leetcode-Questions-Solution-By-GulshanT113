class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int mix = n+m;
        int[] arr = new int[mix];
        int a = arr.length;
        int idx = 0;
        for(int i : nums1) arr[idx++] = i;
        for(int i : nums2) arr[idx++] = i;
        // for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        Arrays.sort(arr);
        if(a % 2 == 1) {
            int ans = a/2;
            double d = arr[ans];
            return d;
        }
        else if(a % 2 == 0){
            int ans = a/2;
            double x = arr[ans]+arr[ans-1];
            double min = x/2;       
            return min;
        }
        return 0.0;
    }
}