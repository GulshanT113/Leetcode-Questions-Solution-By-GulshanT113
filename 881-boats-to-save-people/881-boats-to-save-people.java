class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0;
        int j = n-1;
        int c = 0;
        while(i <= j){
            int l = people[i];
            int h = people[j];
            if(l + h <= limit){
                c++;
                i++;
                j--;
            }
            else{
                j--;
                c++;
            }
        }
        return c;
    }
}