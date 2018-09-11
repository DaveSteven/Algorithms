package nowcoder;

/**
 * 斐波那契数列
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class FibonacciTest {

    public int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int fn1 = 1;
        int fn2 = 1;
        while(--n > 1) {

            fn1 += fn2;
            fn2 = fn1 - fn2;

        }

        return fn1;

    }

    public static void main(String[] args) {

        FibonacciTest fibonacci = new FibonacciTest();
        System.out.println(fibonacci.fibonacci(10));

    }

}
