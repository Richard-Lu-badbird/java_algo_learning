/**
 * @date 2022/11/18 16:55:14
 * @description
 */
public class TestSort {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {

        int[] arr = {5, 6, 21, 2, 4, 65, 64, 23};
        //开始测试
        //SelectionSort.selectionSort(arr);
        //InsertSort.insertSort(arr);
        MergeSort.mergeSort(arr);
        for(int a : arr) {
            //注意不要乱用char类型'' ，加法相加会边长ASCII相加
            System.out.println(a + " ");
        }
    }
}
