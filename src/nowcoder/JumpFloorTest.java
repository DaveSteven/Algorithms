package nowcoder;

/**
 * 跳台阶
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloorTest {

    public int JumpFloor(int target) {

        if (target <= 0) {
            return 0;
        }

        if (target == 1) {
            return 1;
        }

        if (target == 2) {
            return 2;
        }

        int fn1 = 1;
        int fn2 = 1;

        while(--target > 0) {

            fn1 += fn2;
            fn2 = fn1 -fn2;

        }

        return fn1;

    }

}
