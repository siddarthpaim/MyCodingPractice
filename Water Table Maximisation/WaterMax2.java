public class WaterMax2 {
    public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

	public static void main(String[] args) {
		int a[] = { 10, 15, 6, 3 };
		int b[] = { 8, 7, 5, 3 };
		System.out.println(maxArea(a));
		System.out.println(maxArea(b));


	}

}
