public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
    static int maxConsecutiveOnes(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int count = 0 ; 
        for(int i = 0 ; i< n ; i++){
            if (arr[i] == 1) count++;
            else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        if (count>ans) {
            return count;
        }
        else{
            return ans;
        }
    }
}