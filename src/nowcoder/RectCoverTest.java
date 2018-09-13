package nowcoder;

/**
 * 矩形覆盖
 * 题目描述：
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 思路：依旧是斐波那契数列
 */
public class RectCoverTest {

    public static int rectCover(int target) {

        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        }

        int fn1 = 1;
        int fn2 = 1;
        while (--target > 0) {
            fn1 += fn2;
            fn2 = fn1 - fn2;
        }

        return fn1;

    }

    public static void main(String[] args) {

        System.out.println(rectCover(10));

    }

}
