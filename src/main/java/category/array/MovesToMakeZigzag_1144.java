package category.array;

/**
 * 1144. 递减元素使数组呈锯齿状
 * <p>
 * https://leetcode-cn.com/problems/decrease-elements-to-make-array-zigzag/
 */
public class MovesToMakeZigzag_1144 {

    public static void main(String[] args) {
        System.out.println(movesToMakeZigzag(new int[]{1, 2, 3}));
        System.out.println(movesToMakeZigzag(new int[]{9, 6, 1, 6, 2}));
        System.out.println(movesToMakeZigzag(new int[]{2, 1, 2}));
        System.out.println(movesToMakeZigzag(new int[]{2, 7, 10, 9, 8, 9}));
        System.out.println(movesToMakeZigzag(new int[]{10, 4, 4, 10, 10, 6, 2, 3}));
        System.out.println(movesToMakeZigzag(new int[]{10, 1, 1, 6, 6, 6, 1, 8, 8, 5, 1, 2, 6, 6, 6, 4, 4, 8, 7, 1}));
    }

    // A 0 1 0 i%2==1 1 001
    // B 1 0 1 i%2==1 0
    public static int movesToMakeZigzag(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return Math.abs(nums[0] - nums[1]);
        }

        int[] opANums = nums.clone(), opBNums = nums.clone();

        int i = 1, opA = 0, opB = 0;
        while (i < nums.length - 1) {
            if (i % 2 == 1) {
                // A 0101010
                if (opANums[i - 1] >= opANums[i]) {
                    opA += (opANums[i - 1] - opANums[i] + 1);
                    opANums[i - 1] = opANums[i] - 1;

                }
                if (opANums[i + 1] >= opANums[i]) {
                    opA += (opANums[i + 1] - opANums[i] + 1);
                    opANums[i + 1] = opANums[i] - 1;
                }
                // B 1010101
                if (opBNums[i - 1] <= opBNums[i]) {
                    opB += (opBNums[i] - opBNums[i - 1] + 1);
                    opBNums[i] = opBNums[i - 1] - 1;
                }
                if (opBNums[i + 1] <= opBNums[i]) {
                    opB += (opBNums[i] - opBNums[i + 1] + 1);
                    opBNums[i] = opBNums[i + 1] - 1;
                }
            }
            i++;
        }
        if (nums.length % 2 == 0) {
            // A
            if (opANums[nums.length - 2] >= opANums[nums.length - 1]) {
                opA += (opANums[nums.length - 2] - opANums[nums.length - 1] + 1);
                opANums[nums.length - 2] = opANums[nums.length - 1] - 1;
            }
            // B
            if (opBNums[nums.length - 2] <= opBNums[nums.length - 1]) {
                opB += (opBNums[nums.length - 1] - opBNums[nums.length - 2] + 1);
                opBNums[nums.length - 1] = opBNums[nums.length - 2] - 1;
            }
        }

//        System.out.println(nums.length);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(opANums) + " " + opA);
//        System.out.println(Arrays.toString(opBNums) + " " + opB);
        return Math.min(opA, opB);
    }

}
