class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int mul = 1;
        int n = arr.length;
        if(arr[0]*arr[1]*arr[n-1] < arr[n-1]*arr[n-2]*arr[n-3])
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else if(arr[0] > 0)
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else if(arr[0] < 0 && arr[n-1] < 0)
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else
        mul = arr[0]*arr[1]*arr[n-1];
        return mul;
    }
}