class Solution {
    public String shiftingLetters(String s, int[] arr) {
        int n = arr.length;
        for(int i = n-2; i >= 0; i--)
            arr[i] = (arr[i] + arr[i+1]) % 26;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            ch -= 'a'; // minus the ascii value.
            int shift = arr[i] + (int)ch;// for add purpose char convert into int.
            shift %= 26;
            int ans = shift + (int)'a';// for add purpose char convert into int.
            sb.append((char)ans); // convert into char.
        }
        return sb.toString();
    }
}