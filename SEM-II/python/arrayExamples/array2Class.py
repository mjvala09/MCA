# slicing and indexing numpyArrays
# --------------------------------

# slicing
# slicing refers to extracting a space range of element from the array.
# the format of slicing operation is as bellow:
# 	arrayname[start:stop:stepsize]

# 	-here the default value of 'start' is 0,
# 							   'stop' is n(number of elements),
# 							   'stepsize' is 1.
# 	-counting starts from 0th position.

from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a)
# retrieving 1st element to 6th element alternatively
print(a[1:6:2])		# [11,13,15]
# Retrieving all the elements
print(a[:])
print(a[::])

# Retrieving all the elements from the third element
print(a[3:])
# Retrieving all the elements from 3rd element alternatively
print(a[3::2])



# # Indexing
# 	-indexing refers to the location of the element.
# 	-by specifying the location number from 0 onwards till 'n'-1,
# 	 we can refer to all the element as a[i] 
# 	 where 'i' can change from 0 to n-1.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a)
i=0
while(i<len(a)):
	print(a[i],end=" ")
	i+=1











# # Attributes of an Array
# -ndim attribute
# -shape attribute
# -size attribute
# -dtype attribute
# -reshape() method
# -flatten() method

# ndim attribute
# 	- The ndim attribute represents the number of dimensions or axes of the array.
# 	- for the single dimensional array ,it will display 1.
# 	- for the two dimensional array,it will display 2.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a.ndim)
b=array([[10,11,12,13],[14,15,16,17]])
print(b.ndim)
c=array([[[6,7,8,9],[10,11,12,13],[14,15,16,17]]])
print(c.ndim)
d=array([[[10,11,12,13],[14,15,16,17]]])
print(d.ndim)


# # shape attribute
# -Shape attribute gives the shape of an array
# -the shape is a tuple listing the number of elements along each dimension.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a.shape)
b=array([[10,11,12,13],[14,15,16,17]])
print(b)
print(b.shape)
b.shape=(4,2)
print(b)
print(b.shape)


# size attributes
	-the size attribute gives the total number of element in the array
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a.size)
b=array([[10,11,12,13],[14,15,16,17]])
print(b.size)


# # dtype attribute
# 	-the dtype attribute gives the data type of array elements.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a.dtype)
b=array([10.10,11,12,13,14,15,16,17])
print(b.dtype)
c=array([10.10,11,12,13,14,15,16,17,'m'])
print(c.dtype)


# # reshape() method
# 	-the reshape() method used to change the shape/dimensions of the array.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a)
b=a.reshape(4,2) #(row, column)
print(b)
c=a.reshape(2,4) #(row, column)
print(c)

# # flatten() method
# 	-this method is used to collapse the element of an array into one dimension.
from numpy import*
a=array([10,11,12,13,14,15,16,17])
print(a)
a=a.reshape(2,4)
print(a)
a=a.flatten()
print(a)

