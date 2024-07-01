
import java.util.Arrays;


public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int n = arr.length + 1;
        int sumOfNumbersInArray = Arrays.stream(arr).sum();
        int actualSum = n * (n + 1) / 2;
        return actualSum - sumOfNumbersInArray;
    }
}
