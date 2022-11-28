/**
 * @date 2022/11/18 16:44:40
 * @description
 * 选择排序通用代码
 * 时间复杂度标准的O(N^^2)
 */
public class SelectionSort {
    public static void main(String[] args) {

    }
    public static void selectionSort(int[] arr) {
        if(arr.length < 2 || arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex]? j : minIndex;
            }
            TestSort.swap(arr, i, minIndex);
        }
    }

}
