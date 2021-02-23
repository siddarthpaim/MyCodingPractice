
def maxArea(Area, Length) :
	area = 0
	for i in range(Length) :
		for j in range(i + 1, Length) :
		
			# Calculating the max area
			area = max(area, min(Area[j], Area[i]) * (j - i))
	return area

# Driver code
a = [ 1, 5, 4, 3 ]
b = [ 3, 1, 2, 4, 5 ]

len1 = len(a)
print(maxArea(a, len1))

len2 = len(b)
print(maxArea(b, len2))

