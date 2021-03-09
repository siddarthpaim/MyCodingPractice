public class NonDecreasing {
    public boolean checkPossibility(int[] nums) {
        int errPos = errPos(nums);
        if (errPos == -1) {
            return true;
        }

        int errVal = nums[errPos];
        nums[errPos] = nums[errPos + 1];
        if (errPos(nums) == -1) {
            return true;
        }

        nums[errPos] = errVal;
        nums[errPos + 1] = errVal;
        if (errPos(nums) == -1) {
            return true;
        }

        return false;
    }

    public int errPos(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }

}
