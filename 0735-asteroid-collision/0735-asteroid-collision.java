class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length){
        if(!stack.isEmpty() && arr[i] < 0 && stack.peek() > 0){
            if(stack.peek() == Math.abs(arr[i])){
                stack.pop();
                i++;
            }
            else if(stack.peek() > Math.abs(arr[i])) i++;
            else if(stack.peek() < Math.abs(arr[i])) stack.pop();
        }
        else{
            stack.add(arr[i]);
            i++;
        }
    }
        // System.out.println(list);
        int ans[] = new int[stack.size()];
        for(int k = ans.length - 1; k >= 0; k--) ans[k] = stack.pop();
        return ans;
    }
}