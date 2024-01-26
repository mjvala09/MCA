# The 2D array and 3d arrays are called multidimensional arrays.
from numpy import*
a=array([[1,2,3,4],[5,6,7,8]])
print(a)
# the internal memory allocator to all the element would be in a single row containing 8 blocks as they are 8 elements
# the elements are stored in the contiguous memory location as shown below:
# ELEMENTS:	   1       2      3       4 	  5 	  6 	  7 	  8
# INDEX   : [0][0]  [0][1]  [0][2]  [0][3]  [1][0]  [1][1]  [1][2]  [1][3]



# the reshape() function
# -this function is useful to convert a 1D array into a multidimensional array.
# -it would be written as below:
# reshape(arrayname,(n,r,c))
# here	# 'n' represents number of arrays in the output.
		# 'r' represents row
		# 'c' represents number of column
from numpy import*
a=array([1,2,3,4,5,6,7,8,9,10,11,12])
print("Single dimension : ")
print(a)
b=reshape(a,(4,3))
print("multidimension : ")
print(b)
c=reshape(a,(2,3,2))
print("multidimension : ")
print(c)


# Indexing in multidimensional arrays
	# -Index represents the location of elements
	# -individual element of 3D array can be accessed by specifying
	#  the location number of the row and
	#  column of the element in the array as:
	#  a[0][0] -> it represents 0th row and 0th column in the array a
	#  a[1][3] -> it represents 1th row and 3th column in the array a


from numpy import*
a=array([[1,2,3],[4,5,6],[7,8,9]])
print(a)
for i in range(len(a)):
	# print(a[i])
	for j in  range(len(a[i])):
		print(a[i][j],end=" ")


# Slicing in multi-dimensional arrays:
from numpy import*
a=array([[1,2,3],[4,5,6],[7,8,9]])
print(a)
print(a[0,:])	# (r,c)
print(a[2,:])	
print(a[:,0])
print(a[0:1,0:1])
print(a[0:1,:])
print(a[2:3,1:2])
print(a[2,:1])
print(a[2,:2])
print(a[0,2])
print(a[1,1])
print(a[0,])


