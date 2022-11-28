package xor;

/**
 * @date 2022/11/19 10:51:24
 * @description
 * Q1:int a[] 中只有一种数字出现了奇数次，其余的数字全部出现了偶数次
 * Q2:int a[] 中只有两种数字出现了奇数次，其余的数字全部出现了偶数次
 * 分别求出Q1和Q2中出现奇数次的数字
 */
public class Array_xor {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 2 ,3, 4, 5, 4};
        int[] arr2 = {2, 3, 2 ,3, 4, 5};
        xorQ1(arr1);
        xorQ2(arr2);
        System.out.println((10 & 2));
    }
    public static void xorQ1(int[] arr) {
        int eor = 0;
        for(int a : arr) {
            eor ^= a;
        }
        System.out.println("原数组中出现奇数次的数字为" + eor);
    }
    public static void xorQ2(int[] arr) {
        int eor = 0;
        for(int a : arr) {
            eor ^= a;
        }
        //eor = a ^ b

        int rightOne = eor & (~eor + 1);
        System.out.println("rightOne = " + rightOne);
        //rightOne 保留 eor中最右侧为1的2进制数字 例如：rightOne = 00000100
        int onlyOne = 0;
        //onlyOne 为eor'，用来保存a或者b
        for(int a : arr) {
            if((a & rightOne) != 0) {
                onlyOne ^= a;
            }
        }
        //onlyOne = a 或者
        //onlyOne = b
        System.out.println("原数组中出现奇数次的数字为" + onlyOne + "和" + (eor ^ onlyOne));

    }
}
