package ludaheng.day3;

/**
 * @date 2022/11/21 20:54:14
 * @description
 * 小和问题，求整个数组的小和的sum
 * mergesort的变体。
 * [1, 3, 4, 2, 5]
 *
 * 逆序对问题的求和问题也是相同的套路子
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        System.out.println("小和为：" + process(arr, 0 , arr.length - 1));
    }
    public static int process(int[] arr, int L, int R) {
        if(L == R) {
            return 0;
        }
        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid) + process(arr, mid + 1, R) + merge(arr, L, mid, R);

    }
    public static int merge(int[] arr, int L, int M, int R) {
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res = 0;
        int[] help = new int[R - L + 1];
        while (p1 <= M && p2 <= R) {
            if (arr[p1] < arr[p2]) {
                res += arr[p1] * (R - p2 + 1);
            }
            help[i++] = arr[p1] < arr[p2]? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for(i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
        return res;

    }
}
