/**
 * Created by Administrator on 2017/11/14.
 */
public class MaximumLengthOfRepeatedSubarray718 {
    public int findLength(int[] A, int[] B) {
        int[][] t1 = new int[A.length + 1][B.length + 1];
        //init
        for (int i = 0; i < A.length; i++) {
            t1[1][i] = 0;
        }
        for (int j = 0; j < A.length; j++) {
            t1[j][1] = 0;
        }
        int max = 0;
        //
        for (int i = 1; i < A.length + 1; i++) {

            for (int j = 1; j < B.length + 1; j++) {
                if (A[i - 1] == B[j - 1]) {
                    int tmp = t1[i - 1][j - 1];
                    t1[i][j] = tmp + 1;
                    if (tmp + 1 > max)
                        max = tmp + 1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumLengthOfRepeatedSubarray718 maximumLengthOfRepeatedSubarray718 = new MaximumLengthOfRepeatedSubarray718();
        int res = maximumLengthOfRepeatedSubarray718.findLength(new int[]{0, 1, 1, 1, 1}, new int[]{1, 0, 1, 0, 1});
        int res1 = maximumLengthOfRepeatedSubarray718.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0});
        int res2 = maximumLengthOfRepeatedSubarray718.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
        System.out.println("123");

    }
}
