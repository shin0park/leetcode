class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int cnt = 0;
        for (int num : nums){
            if(num == 0){
                answer = cnt > answer ? cnt : answer;
                cnt = 0;
            } else {
                cnt++;
            }
        }
        answer = cnt > answer ? cnt : answer;
        return answer;
    }
}