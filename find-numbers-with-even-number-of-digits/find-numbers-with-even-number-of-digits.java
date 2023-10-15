class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int num : nums){
            int digit = Integer.toString(num).length();
            if (digit % 2 == 0){
                answer++;
            } 
        }
        return answer;
    }
}