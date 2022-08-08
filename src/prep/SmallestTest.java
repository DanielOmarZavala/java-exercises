package prep;

import java.util.Arrays;

public class SmallestTest {

public static void smallestTest() {

    int[] arr = {2, 3, -7, 6, 8, 1, -10, 15};
    int n = arr.length;
    int ans = firstMissingPositive(arr, n);
    System.out.println(ans);
}

    public static int firstMissingPositive(int[] nums, int n) {
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ans)
                ans++;
        }
        return ans;
    }

//    public int solution(int[] A) {
//        int arrLength = A.length;
//        int ans = smallestMissingPositive(A, arrLength);
//
//        return ans;
//    }
//
//    public static int smallestMissingPositive(int[] arr, int arrLength) {
//        Arrays.sort(arr);
//        int ans = 1;
//        for (int i = 0; i < arrLength; i++) {
//            if (arr[i] == ans)
//                ans++;
//        }
//        return ans;
//    }
}
