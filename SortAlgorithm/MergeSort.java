/**
 * @date 2022/11/21 20:25:22
 * @description
 */
public class MergeSort {
    public static void main(String[] args) {
    }
    public static void mergeSort(int[] a){
        if (a == null || a.length < 2) {
            return;
        }
        process(a, 0, a.length - 1);
    }
    //递归过程定义
    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, arr.length - 1);
        merge(arr, L, mid, R);
    }
    public static void merge(int[] a, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while(p1 <= M && p2 <= R) {
            help[i++] = a[p1] <= a[p2]? a[p1++] : a[p2++];
        }
        while(p1 <= M) {
            help[i++] = a[p1++];
        }
        while(p2 <= R) {
            help[i++] = a[p2++];
        }
        for (i = 0; i < help.length; i++) {
            a[L + i] = help[i];
        }
    }
}
