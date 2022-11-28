/**
 * @date 2022/11/19 11:18:39
 * @description
 * 时间复杂度某些状态下不是严格的O(N^^2)
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > arr[j + 1]) {
                    TestSort.swap(arr, j, j + 1);
                }
            }
        }
    }
}
