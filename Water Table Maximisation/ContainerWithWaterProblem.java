
class WaterTableArea{

public static int WaterTableArea(int[] a)
{

	int Area = 0;
	
	for(int i = 0; i < a.length; i++)
	{
		for(int j = i + 1; j < a.length; j++) 
		{
			Area = Math.max(
				Area, Math.min(a[i], a[j]) * 
							(j - i));
		}
	}
	return Area;
}

public static void main(String[] args)
{
	int a[] = { 6, 3, 8, 1 };
	int b[] = { 2, 15, 11, 14 };

	System.out.println(WaterTableArea(a));
	System.out.println(WaterTableArea(b));
}
}

