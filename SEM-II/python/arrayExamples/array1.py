from array import*
arr = array('i',[1,2,3,4,5])
print(arr)
print(arr[0])

# APPEND THE ELEMENTS
arr.append(6)
arr.append(7)
# arr.append(8,9) # only one parameter is allowed 
print(arr)
print(arr[0])

# INSERTING THE ELEMENTS
arr.insert(0,0)
arr.insert(8,8)
arr.insert(100,200)
arr.insert(9,9) # it will inserted at the last of the array
print(arr)
print(arr[0])


# REMOVING THE ELEMENTS
# arr.remove(100) # there is no value 100 in this array
arr.remove(200)
print(arr)
print(arr[0])


#REMOVING THE LAST ELEMENT
a=arr.pop()
print('removed element is : ',a)
print("after removing the last element",arr)
print(arr)
print(arr[0])


# FINDING THE POSITION OF AN ELEMENT
a=arr.index(8)
print(a)


# REMOVING AS PER THE INDEX/POSITION
a=arr.pop(8)
print(arr)
print(arr[0])


# CONVERT AN ARRAY INTO THE LIST
lst=arr.tolist()
print("array element : ",arr)
print("list element : ",lst)
# ================================================

from array import*
str1 = input('enter marks : ').split(',')
marks = [int(number) for number in str1]
total = 0
for i in marks:
	# print(i)
	total+=i
print('Score : ',total)
l=len(marks)
percentage = total/l
print('Percentage : ',percentage)
