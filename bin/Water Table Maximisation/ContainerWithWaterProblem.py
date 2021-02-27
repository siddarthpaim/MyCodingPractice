
def WaterTableMaximization(Area, Length) :
	area = 0
	for i in range(Length) :
		for j in range(i + 1, Length) :
		
		
			area = max(area, min(Area[j], Area[i]) * (j - i))
	return area


a = [ 3, 8, 7, 6 ]
b = [ 1, 5, 8, 3 ]

len1 = len(a)
print(WaterTableMaximization(a, len1))

len2 = len(b)
print(WaterTableMaximization(b, len2))

