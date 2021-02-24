
// Water Container 
import java.io.*;

class ContainerWithWaterProblem{

public static int maxArea(int[] a)
{

	int Area = 0;
	
	for(int i = 0; i < a.length; i++)
	{
		for(int j = i + 1; j < a.length; j++) 
		{
			Area = Math.max(
				Area, Math.min(a[i], a[j]) * 	(j - i));
		}
	}
	return Area;
}

// Driver code 
public static void main(String[] args)
{
	int a[] = { 10, 15, 6, 3 };
	int b[] = { 8, 7, 5, 3 };

	System.out.println(maxArea(a));
	System.out.println(maxArea(b));
}
}

// This code is contributed by mulchandanimanisha5
