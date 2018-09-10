package nowcoder;

/**
 * 1. 二维数组中的查找
 * 题目描述：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

// 通过循环拿到每一行，然后使用二分查找。
public class FindTest {

     public static boolean Find(int target, int [][] array) {

        if (array[0].length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            int last = array[i].length - 1;

            if (target > array[i][last]) {
                continue;
            }

            int mid = 0;
            int left = 0;
            int right = array[i].length - 1;

            while(left <= right) {

                mid = (left + right) / 2;

                if (target == array[i][mid]) {
                    return true;
                } else if (target > array[i][mid]) {
                    left = mid + 1;
                } else if (target < array[i][mid]) {
                    right = mid - 1;
                }

            }

        }

        return false;

    }

    public static void main(String[] args) {

        int [][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        System.out.println(Find(7, arr));

    }

}
