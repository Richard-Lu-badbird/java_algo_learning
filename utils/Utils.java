import java.util.Arrays;

/**
 * @date 2022/11/19 15:12:29
 * @description
 * 对数器的实现，经过500000对数，方便自己知道方法是正确的。
 */
public class Utils {
    //for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }
    //for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        //Math.random() -> [0,1) 里的小数，等概率返回一个
        //Math.random() * N -> [0,N) 里的小数，等概率返回一个
        //(int)(Math.random() * N) -> [0, N-1]里的整数，等概率返回一个
        int[] arr = new int[(int)((maxSize + 1) * Math.random())];
        //数组的长度随机
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)((maxValue + 1) * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if(arr == null) {
            return null;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if(arr1 == null || arr2 == null) {
            return false;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for(int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            InsertSort.insertSort(arr1);
            comparator(arr2);
            if(!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed? "Nice" : "Fucking fucked!");


        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        System.out.println(" ");
        InsertSort.insertSort(arr);
        printArray(arr);
    }

}
