class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        Stack<Integer> intStack = new Stack();
        for(int i= len - 1; i >= 0; i--){
            if(arr[i]==0){
                 intStack.push(arr[i]);
                 intStack.push(arr[i]);
            } else {
                intStack.push(arr[i]);
            }
        }
        for(int i = 0; i < len; i++){
            arr[i] = intStack.pop();
        }
    }
}