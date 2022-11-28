package ludaheng.day3;

/**
 * @date 2022/11/21 20:19:05
 * @description
 * 使用递归的方法
 */
public class GetMaxValue {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1, 0, 2, 3, 5, 6,7,10};
        System.out.println(process(a, 0, a.length - 1));
    }
    //在[left, right]求解数组的最大值
    public static int process(int[] a, int left, int right) {
        if(left == right) {
            return a[left];
        }
        int mid = left + ((right - left) >> 2);
        int leftVal = process(a, left, mid);
        int rightVal = process(a, mid + 1, right);
        return Math.max(leftVal, rightVal);

    }
}
