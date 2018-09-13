package nowcoder;

/**
 * 变态跳台阶
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 思路：
 * F(1) = 1, F(2) = 2, F(3) = F(2) + F(1) + F(0)
 * F(n) = F(n-1) + F(n-2) + ... + F((n-(n-1) + F(n-n)
 * F(n) = F(1) + F(2) + F(3) + ... + F(n-2) + F(n-1)
 * F(n) = F(n-1) + F(n-1)
 * F(n) = 2 * F(n-1)
 */
public class JumpFloorIITest {

    public static int jumpFloorII (int target) {

        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        }

        return 2 * jumpFloorII(target - 1);

    }

    public static void main(String[] args) {

        System.out.println(jumpFloorII(10));

    }

}
