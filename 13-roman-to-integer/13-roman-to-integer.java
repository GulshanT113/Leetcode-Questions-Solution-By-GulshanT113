class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);hm.put('V',5);hm.put('X',10);hm.put('L',50);hm.put('C',100);hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(hm.get(ch));
            else{
                int temp = hm.get(ch);
                if(st.peek() < temp) {
                    int a = st.pop();
                    st.push(a*-1);
                    st.push(temp);
                }
                else st.push(temp);
            }
        }
        while(!st.isEmpty()) sum = sum + st.pop();
        return sum;
    }
}