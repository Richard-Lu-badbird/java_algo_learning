/**
 * @date 2022/11/22 13:03:48
 * @description
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 53, 23};
        quickSort(a);
        for (int k:a) {
            System.out.println(k);
        }
    }
    public static void quickSort(int[] a) {
        if(a == null || a.length < 2) {
            return;
        }
        quickSort(a, 0, a.length - 1);

    }
    //a[1...r] 排好序
    public static void quickSort(int[] a, int L, int R) {
        if( L < R) {
            int temp = L + (int)(Math.random() * (R - L + 1));
            swap(a, temp, R);
            int[] p = partition(a, L, R);
            quickSort(a, L, p[0] - 1);
            quickSort(a, p[1] + 1, R);
        }
    }
    //处理arr[1...r]的函数
    //默认以arr[r] = p做划分，即arr的最后一个元素      <p     =p     >p
    //返回等于p（左边界，右边界），所以返回一个长度为2的数组res，res[0],res[1]
    public static int[] partition(int[] a, int L, int R) {
        int less = L - 1;//<区右边界
        int more = R;//>区左边界
        while(L < more) {//L表示当前值，arr[R]为划分值
            if(a[L] < a[R]) {
                swap(a, ++less, L++);
            } else if (a[L] > a[R]) {
                swap(a, --more, L);
            }else {
                L++;
            }
        }
        swap(a, R, more);
        return new int[]{less + 1, more};
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
