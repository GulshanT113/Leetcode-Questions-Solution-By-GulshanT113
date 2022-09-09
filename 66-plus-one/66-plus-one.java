class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        int n = arr.length;
        int i = n-1;
        while(i >= 0){
            int ele = arr[i];
            int sum = ele + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            i--;
        }
        if(carry == 1){
            int[] ans = new int[n+1];
            ans[0] = 1;
            return ans;
        }
        return arr;
    }
}