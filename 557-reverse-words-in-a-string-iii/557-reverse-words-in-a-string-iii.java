class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (String i : arr) {
            StringBuilder rev = new StringBuilder(i).reverse();
            str.append(rev + " ");
        }
        str.setLength(str.length() - 1); // remove the last whitespace
        return str.toString();
    }
}