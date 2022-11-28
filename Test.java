/**
 * @date 2022/11/21 19:57:30
 * @description
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1, 5};
        //selectSort(a);
        insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(a[j + 1] < a[j]) {
                    TestSort.swap(a, j + 1, j);
                }
            }
        }
    }
    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                minIndex = a[j] < a[minIndex] ? j : minIndex;
            }
            TestSort.swap(a, i, minIndex);
        }
    }
}
