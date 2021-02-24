
public class WaterMax {

	
	    public static int maxArea(int[] height) {
	        int maxarea = 0;
	        for (int i = 0; i < height.length; i++)
	            for (int j = i + 1; j < height.length; j++)
	                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
	        return maxarea;
	    }
	
	public static void main(String[] args) {
		int a[] = { 10, 15, 6, 3 };
		int b[] = { 8, 7, 5, 3 };
		System.out.println(maxArea(a));
		System.out.println(maxArea(b));

		

	}

}
